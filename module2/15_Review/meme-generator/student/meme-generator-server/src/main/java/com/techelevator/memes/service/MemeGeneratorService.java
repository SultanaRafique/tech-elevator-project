package com.techelevator.memes.service;

import com.techelevator.memes.model.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemeGeneratorService {

    private static final String BASE_API_URL = "https://api.imgflip.com/";
    private static final String API_USERNAME = "ym.phl.te.class.tests";
    private static final String API_PASSWORD = "NpaPrwkTrE4yJY";

    private final RestTemplate restTemplate;
    private final MemeUtils memeUtils;

    public MemeGeneratorService() {
        this.restTemplate = new RestTemplate();
        this.memeUtils = new MemeUtils();
    }

    public List<MemeListItem> getMemeList() {
        List<MemeListItem> memeList = new ArrayList<>();

        // create a list of MemeListItems using the getMemes() method
        Meme[] memes = getMemes();
        for (Meme meme : memes){
            MemeListItem item = new MemeListItem();
            item.setMemeId(meme.getId());
            item.setMemeName(meme.getName());
            memeList.add(item);
        }

        return memeList;
    }

    /**
     * Consumes the get_memes endpoint of the imgflip meme generator APU
     * @return
     */
    private Meme[] getMemes() {
        try {
            MemeApiGetResponse response = restTemplate.getForObject(BASE_API_URL + "/get_memes", MemeApiGetResponse.class);

            if(response != null && response.getData() != null){
                return  response.getData().getMemes();
            }
        } catch (RestClientResponseException ex){
            System.out.println(ex.getMessage());
        } catch (ResourceAccessException ex){
            System.out.println(ex.getMessage());
        }

        return new Meme[] {};
    }

    /**
     * Uses caption_image endpoint to create meme and return URL
     * @param info
     * @return String
     */
    public String createMeme(CreateMemeInfo info) {
        CaptionedMeme newMeme = new CaptionedMeme();
        newMeme.setTemplate_id(info.getMemeId());
        newMeme.setUsername(API_USERNAME);
        newMeme.setPassword(API_PASSWORD);
        newMeme.setText0(info.getCaption());

        MultiValueMap<String,String> formData = memeUtils.formDataFromCaptionedMeme(newMeme);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity< MultiValueMap<String,String>> entity = new HttpEntity<>(formData, headers );

        try {
            MemeApiCreateResponse response = restTemplate.postForObject(BASE_API_URL + "/caption_image", entity, MemeApiCreateResponse.class);

            if(response != null && response.getData() != null) {

                return response.getData().getUrl();
            }

        }catch (RestClientResponseException ex){
            System.out.println(ex.getMessage());
        }catch(ResourceAccessException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}

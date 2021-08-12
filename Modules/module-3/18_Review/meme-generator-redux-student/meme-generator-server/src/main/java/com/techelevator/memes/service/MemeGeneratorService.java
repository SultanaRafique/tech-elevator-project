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
        Meme[] memes = getMemes();

        List<MemeListItem> memeList = new ArrayList<>();
        for (Meme meme : memes) {
            MemeListItem item = new MemeListItem();
            item.setMemeId(meme.getId());
            item.setMemeName(meme.getName());
            item.setMemeUrl(meme.getUrl());
            memeList.add(item);
        }

        return memeList;
    }

    public Meme[] getMemes() {
        try {
            MemeApiResponse response = restTemplate.getForObject(BASE_API_URL + "/get_memes", MemeApiResponse.class);
            if (response != null && response.getData() != null) {
                return response.getData().getMemes();
            }
        } catch (RestClientResponseException ex) {
            System.out.println(ex.getMessage());
        } catch (ResourceAccessException ex) {
            System.out.println(ex.getMessage());
        }
        return new Meme[] {};
    }

    public String createMeme(CreateMemeInfo info) {
        CaptionedMeme meme = new CaptionedMeme();
        meme.setTemplateId(info.getMemeId());
        meme.setText0(info.getCaption1());
        meme.setText1(info.getCaption2());
        meme.setUsername(API_USERNAME);
        meme.setPassword(API_PASSWORD);

        MultiValueMap<String, String> formData = memeUtils.formDataFromCaptionedMeme(meme);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(formData, headers);

        try {
            MemeApiCreateResponse result = restTemplate.postForObject("https://api.imgflip.com/caption_image",
                    entity, MemeApiCreateResponse.class);
            if (result != null && result.getData() != null) {
                return result.getData().getUrl();
            }
        } catch (RestClientResponseException ex) {
            System.out.println(ex.getMessage());
        } catch (ResourceAccessException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
}

package com.techelevator.memes.service;

import com.techelevator.memes.model.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

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

        return memeList;
    }

    /**
     * Consumes the get_memes endpoint of the imgflip meme generator APU
     * @return
     */
    private Meme[] getMemes() {

        // add code to call get_memes endpoint

        return new Meme[] {};
    }

    /**
     * Uses caption_image endpoint to create meme and return URL
     * @param info
     * @return String
     */
    public String createMeme(CreateMemeInfo info) {

        return null;
    }
}

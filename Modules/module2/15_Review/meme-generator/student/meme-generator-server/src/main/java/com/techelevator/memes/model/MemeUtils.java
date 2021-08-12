package com.techelevator.memes.model;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class MemeUtils {

    public MultiValueMap<String, String> formDataFromCaptionedMeme(CaptionedMeme meme) {
        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();

        map.add("template_id", meme.getTemplate_id());
        map.add("username", meme.getUsername());
        map.add("password", meme.getPassword());
        map.add("text0", meme.getText0());


        return map;
    }


}

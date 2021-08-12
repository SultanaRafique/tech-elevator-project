package com.techelevator.memes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class used to create meme via API
 */
public class CaptionedMeme {

    @JsonProperty("template_id")
    private String templateId;

    private String username;
    private String password;

    private String text0;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getText0() {
        return text0;
    }

    public void setText0(String text0) {
        this.text0 = text0;
    }
}

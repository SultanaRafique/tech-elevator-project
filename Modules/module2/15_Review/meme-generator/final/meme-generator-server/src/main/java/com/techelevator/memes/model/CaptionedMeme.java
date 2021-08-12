package com.techelevator.memes.model;

/**
 * Class used to create meme via API
 */
public class CaptionedMeme {


    private String template_id;
    private String username;
    private String password;
    private String text0;

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
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

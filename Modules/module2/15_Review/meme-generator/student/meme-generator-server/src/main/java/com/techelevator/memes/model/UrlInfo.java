package com.techelevator.memes.model;

/**
 * Class to hold URL info from repsonse rewceived from caption_image API endpoint
 */
public class UrlInfo {



    // you can include on the url property and ignore the page_url property
        private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

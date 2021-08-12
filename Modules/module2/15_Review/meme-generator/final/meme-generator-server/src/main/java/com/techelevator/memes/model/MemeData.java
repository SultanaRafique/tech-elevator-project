package com.techelevator.memes.model;

/**
 * Class to hold data from get_memes endpoint
 */
public class MemeData {

    private Meme[] memes;

    public Meme[] getMemes() {
        return memes;
    }

    public void setMemes(Meme[] memes) {
        this.memes = memes;
    }
}

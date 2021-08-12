package com.techelevator.music;

import com.techelevator.Catalogable;
import com.techelevator.Streamable;

public class DigitalMusic extends MusicMedia implements Catalogable, Streamable {

    private String purchaseModel;

    public DigitalMusic(String label, String asin, String releaseDate, String title, String artist, String purchaseModel) {
        super(label, asin, releaseDate, title, artist);
        this.purchaseModel = purchaseModel;
    }

    public String getPurchaseModel() {
        return purchaseModel;
    }

    @Override
    public String getFormat() {
        return "Digital Music";
    }

    @Override
    public String getCatalogString() {
        return String.format("Title: %s; Artist: %s; Label: %s; ASIN: %s; Release Date: %s; Format: %s; Purchase Model: %s",
                getTitle(), getArtist(), getLabel(), getAsin(), getReleaseDate(), getFormat(), getPurchaseModel());
    }
}

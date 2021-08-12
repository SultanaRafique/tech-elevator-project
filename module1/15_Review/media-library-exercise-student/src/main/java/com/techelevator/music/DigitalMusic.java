package com.techelevator.music;

import com.techelevator.Catalogable;
import com.techelevator.Media;
import com.techelevator.Streamable;
import com.techelevator.movie.MovieMedia;

public class DigitalMusic extends MusicMedia implements Catalogable, Streamable {

    private String purchaseModel;

    public DigitalMusic(String label, String asin, String releaseDate, String title, String artist, String purchaseModel) {
        super(label, asin, releaseDate, title, artist);
        this.purchaseModel = purchaseModel;
    }

   /*public DigitalMusic(String studio, String asin, String mpaaRating, String director, String releaseDate, String title, String purchaseModel) {
        super(studio, asin, mpaaRating, director, releaseDate, title);
        this.purchaseModel = purchaseModel;
    }*/

    public String getPurchaseModel() {
        return purchaseModel;
    }

    @Override
    public String getFormat() {
        return "Digital Music";
    }


    //DigitalMusic digitalMusic = new DigitalMusic("Sony", "SON-4365", "May 28, 2021",
    //                "Tech Elevator Tunes", "Various Artists", Media.PURCHASE_MODEL_STREAM);
    @Override
    public String getCatalogString() {
        return String.format("Title: %s; Label: %s; ASIN: %s; Release Date: %s; Artist %s;" +
                        " Media Type: %s; Formate: %s; Purchase Model: %s" ,
                getTitle(),getLabel(), getAsin(), getReleaseDate(), getArtist(),
                getMediaType(), getFormat(), getPurchaseModel());
    }
}

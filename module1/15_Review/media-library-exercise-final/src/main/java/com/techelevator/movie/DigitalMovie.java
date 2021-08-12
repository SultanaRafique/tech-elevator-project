package com.techelevator.movie;

import com.techelevator.Catalogable;
import com.techelevator.Streamable;

public class DigitalMovie extends MovieMedia implements Catalogable, Streamable {

    private String purchaseModel;

    public DigitalMovie(String studio, String asin, String mpaaRating, String director, String releaseDate, String title,
                        String purchaseModel) {
        super(studio, asin, mpaaRating, director, releaseDate, title);
        this.purchaseModel = purchaseModel;
    }

    public String getPurchaseModel() {
        return purchaseModel;
    }

    @Override
    public String getFormat() {
        return "Digital Movie";
    }

    @Override
    public String getCatalogString() {
        return String.format("Title: %s; Studio: %s; ASIN: %s; Release Date: %s; MPAA Rating: %s; "
                        + "Director: %s; Media Type: %s; Format: %s; Purchase Model: %s",
                getTitle(), getStudio(), getAsin(), getReleaseDate(), getMpaaRating(),
                getDirector(), getMediaTypeDescription(), getFormat(), getPurchaseModel());
    }
}

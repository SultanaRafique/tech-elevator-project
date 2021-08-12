package com.techelevator.movie;

import com.techelevator.Catalogable;

public class DVD extends MovieMedia implements Catalogable {

    private Integer numberOfDiscs;



    public DVD(String studio, String asin, String mpaaRating, String director, String releaseDate, String title, Integer numberOfDiscs) {
        super(studio,asin, mpaaRating, director, releaseDate, title);
        this.numberOfDiscs = numberOfDiscs;
    }

    public Integer getNumberOfDiscs() {
        return numberOfDiscs;
    }


    @Override
    public String getFormat() {
        return "DVD";
    }

    @Override
    public String getCatalogString() {
        return String.format("Title: %s; MPAA Rating: %s; Director: %s; ASIN: %s; Release Date: %s;" +
                        " Format: %s; Discs: %d" ,
                getTitle(), getMpaaRating(), getDirector(), getAsin(), getReleaseDate(),
                getFormat(), getNumberOfDiscs());
    }
}

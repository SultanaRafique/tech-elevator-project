package com.techelevator.music;

import com.techelevator.Catalogable;
import com.techelevator.movie.MovieMedia;

public class CD extends MusicMedia implements Catalogable {

    private Integer numberOfDiscs;



    public CD( String label, String asin, String releaseDate, String title, String artist, Integer numberOfDiscs) {
        super(label, asin, releaseDate, title, artist);
        this.numberOfDiscs = numberOfDiscs;
    }

    public Integer getNumberOfDiscs() {
        return numberOfDiscs;
    }

    @Override
    public String getFormat() {
        return "CD";
    }


    @Override
    public String getCatalogString() {
        return String.format("Title: %s; Artist: %s; Label: %s; ASIN: %s; Release Date: %s;" +
                        " Format: %s; Discs: %d" ,
                getTitle(), getArtist(), getLabel(), getAsin(), getReleaseDate(),
                 getFormat(), getNumberOfDiscs());
    }
}

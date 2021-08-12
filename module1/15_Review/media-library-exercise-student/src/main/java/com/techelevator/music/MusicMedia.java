package com.techelevator.music;

import com.techelevator.Media;

public abstract class MusicMedia extends Media {

    private String label;
    private String asin;
    private String releaseDate;
    private String title;
    private String artist;

    public MusicMedia( String label, String asin, String releaseDate, String title, String artist) {
        super(Media.MEDIA_MUSIC);
        this.label = label;
        this.asin = asin;
        this.releaseDate = releaseDate;
        this.title = title;
        this.artist = artist;
    }


    public String getLabel() {
        return label;
    }

    public String getAsin() {
        return asin;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }


}

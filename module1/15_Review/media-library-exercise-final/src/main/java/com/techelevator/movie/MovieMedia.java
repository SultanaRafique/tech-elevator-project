package com.techelevator.movie;

import com.techelevator.Media;

public abstract class MovieMedia extends Media {

    private String studio;
    private String asin;
    private String mpaaRating;
    private String director;
    private String releaseDate;
    private String title;

    public MovieMedia(String studio, String asin, String mpaaRating, String director, String releaseDate, String title) {
        super(Media.MEDIA_MOVIE);
        this.studio = studio;
        this.asin = asin;
        this.mpaaRating = mpaaRating;
        this.director = director;
        this.releaseDate = releaseDate;
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public String getAsin() {
        return asin;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public String getDirector() {
        return director;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getTitle() {
        return title;
    }
}

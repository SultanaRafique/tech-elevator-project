package com.techelevator;

public abstract class Media {

    public static final int MEDIA_MUSIC = 1;
    public static final int MEDIA_MOVIE = 2;

    private static final String MEDIA_TYPE_MUSIC_DESCRIPTION = "Music";
    private static final String MEDIA_TYPE_MOVIE_DESCRIPTION = "Movie";
    private static final String MEDIA_TYPE_UNKNOWN_DESCRIPTION = "Unknown";

    public static final String PURCHASE_MODEL_PURCHASE = "Purchase";
    public static final String PURCHASE_MODEL_STREAM = "Stream";

    private int mediaType;

    // Use mediaType to initialize Media item
    public Media(int mediaType) {
        this.mediaType = mediaType;
    }

    public int getMediaType() {
        return mediaType;
    }

    public String getMediaTypeDescription() {
        switch (mediaType) {
            case MEDIA_MUSIC:
                return MEDIA_TYPE_MUSIC_DESCRIPTION;
            case MEDIA_MOVIE:
                return MEDIA_TYPE_MOVIE_DESCRIPTION;
            default:
                return MEDIA_TYPE_UNKNOWN_DESCRIPTION;
        }
    }

    public abstract String getFormat();


}

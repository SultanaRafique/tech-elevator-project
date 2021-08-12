package com.techelevator;

import com.techelevator.movie.DVD;
import com.techelevator.movie.DigitalMovie;
import com.techelevator.music.CD;
import com.techelevator.music.DigitalMusic;

public class MediaLibraryApp {

    public static void main(String[] args) {
        MediaLibrary library = new MediaLibrary();

        // add some items to library


        CD cd1 = new CD("Sony", "SON-4365", "May 28, 2021",
                "Tech Elevator Tunes", "Various Artists", 2);

        String cd1catalogString = String.format("CD 1 Catalog String: %s", cd1.getCatalogString());

        System.out.println(cd1catalogString);

        CD cd2 = new CD("Sony", "SON-4366", "May 28, 2021",
                "Tech Elevator Tunes 2", "Various Artists", 1);

        System.out.println(String.format("CD 2 Catalog String: %s", cd2.getCatalogString()));

        DigitalMusic digitalMusic = new DigitalMusic("Sony", "SON-4365", "May 28, 2021",
                "Tech Elevator Tunes", "Various Artists", Media.PURCHASE_MODEL_STREAM);

        System.out.println(String.format("Digital Music Catalog String: %s", digitalMusic.getCatalogString()));

        DVD dvd = new DVD("MGM", "MGM-4F88X", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders", 1);

        System.out.println(String.format("DVD Catalog String: %s", dvd.getCatalogString()));

        DigitalMovie digitalMovie = new DigitalMovie("MGM", "MGM-4F88X", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders", Media.PURCHASE_MODEL_PURCHASE);

        System.out.println(String.format("Digital Movie Catalog String: %s", digitalMovie.getCatalogString()));


        library.addItem(cd1);
        library.addItem(cd2);
        library.addItem(digitalMusic);
        library.addItem(dvd);
        library.addItem(digitalMovie);

        // call methods in library
        int itemInLibrary = library.getItemsInLibrary();
        System.out.println("Items in library: " + itemInLibrary);

        int cdItemsInLibrary = library.getItemsInLibraryByFormat("CD");
        System.out.println("CD Items in library: " + cdItemsInLibrary);

        for (Catalogable item : library.getCatalogableItemsInLibrary()) {
            System.out.println(item.getCatalogString());
        }
    }
}

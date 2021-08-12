package com.techelevator;

import com.techelevator.movie.DVD;
import com.techelevator.movie.DigitalMovie;
import com.techelevator.music.CD;
import com.techelevator.music.DigitalMusic;
import org.junit.Assert;
import org.junit.Test;

public class MediaLibraryTest {

    @Test
    public void getItemsInLibrary_hasValidElements_shouldReturnCorrectSize() {
        // Arrange
        MediaLibrary library = new MediaLibrary();
        CD cd1 = new CD("Sony", "SON-4365", "May 28, 2021",
                "Tech Elevator Tunes", "Various Artists", 2);
        DigitalMusic digitalMusic = new DigitalMusic("Sony", "SON-4365", "May 28, 2021",
                "Tech Elevator Tunes", "Various Artists", Media.PURCHASE_MODEL_STREAM);
        DVD dvd = new DVD("MGM", "MGM-4F88X", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders", 1);
        DigitalMovie digitalMovie = new DigitalMovie("MGM", "MGM-4F88X", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders", Media.PURCHASE_MODEL_PURCHASE);

        library.addItem(cd1);
        library.addItem(digitalMusic);
        library.addItem(dvd);
        library.addItem(digitalMovie);
        Integer expected = 4;

        // Act
        Integer result = library.getItemsInLibrary();

        // Assert
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getItemsInLibrary_hasNoElements_shouldReturnZeroe() {
        // Arrange
        MediaLibrary library = new MediaLibrary();
        Integer expected = 0;

        // Act
        Integer result = library.getItemsInLibrary();

        // Assert
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getItemsInLibraryByFormat_withDataThatHasDVds_shouldReturnDvdCount() {
        // Arrange
        MediaLibrary library =  new MediaLibrary();
        CD cd1 = new CD("Sony", "SON-4365", "May 28, 2021",
                "Tech Elevator Tunes", "Various Artists", 2);
        DigitalMusic digitalMusic = new DigitalMusic("Sony", "SON-4365", "May 28, 2021",
                "Tech Elevator Tunes", "Various Artists", Media.PURCHASE_MODEL_STREAM);
        DVD dvd = new DVD("MGM", "MGM-4F88X", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders", 1);
        DVD dvd2 = new DVD("MGM", "MGM-4F88X2", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders 2", 1);
        DigitalMovie digitalMovie = new DigitalMovie("MGM", "MGM-4F88X", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders", Media.PURCHASE_MODEL_PURCHASE);

        library.addItem(cd1);
        library.addItem(digitalMusic);
        library.addItem(dvd);
        library.addItem(dvd2);
        library.addItem(digitalMovie);
        Integer expected = 2;

        // Act
        Integer result = library.getItemsInLibraryByFormat("DVD");

        // Assert
        Assert.assertEquals(expected, result);
    }
}

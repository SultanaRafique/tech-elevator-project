package com.techelevator;

import com.techelevator.movie.DVD;
import com.techelevator.movie.DigitalMovie;
import com.techelevator.music.CD;
import com.techelevator.music.DigitalMusic;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MediaLibraryTests {

    @Test
    public void getItemsInLibraryByFormat_withDataThatHasDVds_shouldReturnDvdCount(){

      //Arrange
        MediaLibrary library = new MediaLibrary();

        CD cd1 = new CD("Sony", "SON-4365", "May 28, 2021",
                "Tech Elevator Tunes", "Various Artists", 2);

        CD cd2 = new CD("Sony", "SON-4366", "May 28, 2021",
                "Tech Elevator Tunes 2", "Various Artists", 1);
        DigitalMusic digitalMusic = new DigitalMusic("Sony", "SON-4365", "May 28, 2021",
                "Tech Elevator Tunes", "Various Artists" , Media.PURCHASE_MODEL_STREAM);
        DVD dvd = new DVD("MGM", "MGM-4F88X", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders", 1);
        DigitalMovie digitalMovie = new DigitalMovie("MGM", "MGM-4F88X", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders", Media.PURCHASE_MODEL_PURCHASE);
        library.addItem(cd1);
        library.addItem(cd2);
        library.addItem(digitalMusic);
        library.addItem(dvd);
        library.addItem(digitalMovie);

        Integer Expected = 1;

        //Act
        Integer  result = library.getItemsInLibraryByFormat("DVD");

        //Assert
        Assert.assertEquals(Expected,result);


    }

    @Test
    public void getItemsInLibraryByFormat_withDataThatHasCDs_shouldReturnDvdCount(){

        //Arrange
        MediaLibrary library = new MediaLibrary();

        CD cd1 = new CD("Sony", "SON-4365", "May 28, 2021",
                "Tech Elevator Tunes", "Various Artists", 2);

        CD cd2 = new CD("Sony", "SON-4366", "May 28, 2021",
                "Tech Elevator Tunes 2", "Various Artists", 1);
        DigitalMusic digitalMusic = new DigitalMusic("Sony", "SON-4365", "May 28, 2021",
                "Tech Elevator Tunes", "Various Artists" , Media.PURCHASE_MODEL_STREAM);
        DVD dvd = new DVD("MGM", "MGM-4F88X", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders", 1);
        DigitalMovie digitalMovie = new DigitalMovie("MGM", "MGM-4F88X", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders", Media.PURCHASE_MODEL_PURCHASE);
        library.addItem(cd1);
        library.addItem(cd2);
        library.addItem(digitalMusic);
        library.addItem(dvd);
        library.addItem(digitalMovie);

        Integer Expected = 2;

        //Act
        Integer  result = library.getItemsInLibraryByFormat("CD");

        //Assert
        Assert.assertEquals(Expected,result);


    }

    @Test
    public void getItemsInLibrary_hasValidElements_shouldReturnCorrectSize(){

        //Arrange
        MediaLibrary library = new MediaLibrary();

        CD cd1 = new CD("Sony", "SON-4365", "May 28, 2021",
                "Tech Elevator Tunes", "Various Artists", 2);

        CD cd2 = new CD("Sony", "SON-4366", "May 28, 2021",
                "Tech Elevator Tunes 2", "Various Artists", 1);
        DigitalMusic digitalMusic = new DigitalMusic("Sony", "SON-4365", "May 28, 2021",
                "Tech Elevator Tunes", "Various Artists" , Media.PURCHASE_MODEL_STREAM);
        DVD dvd = new DVD("MGM", "MGM-4F88X", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders", 1);
        DigitalMovie digitalMovie = new DigitalMovie("MGM", "MGM-4F88X", "PG-13", "Penny Marshall",
                "March 10, 2019", "Awesome Coders", Media.PURCHASE_MODEL_PURCHASE);
        library.addItem(cd1);
        library.addItem(cd2);
        library.addItem(digitalMusic);
        library.addItem(dvd);
        library.addItem(digitalMovie);

        Integer Expected = 5;

        //Act
        Integer  result = library.getItemsInLibrary();

        //Assert
        Assert.assertEquals(Expected,result);


    }

    @Test
    public void getItemsInLibrary_hasNoElements_shouldReturnZero(){

        //Arrange
        MediaLibrary library = new MediaLibrary();
        Integer Expected = 0;

        //Act
        Integer  result = library.getItemsInLibrary();

        //Assert
        Assert.assertEquals(Expected,result);


    }
}

package com.techelevator;

import org.junit.Assert;
import org.junit.Test;



public class CigarPartyTests {
    //cigar = 0, weekend = false.......false
    @Test
    public void cigarParty_zeroCigar_weekdays_shouldReturnFalse(){
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean result = cigarParty.haveParty(0,false);

        //Assert
        Assert.assertFalse(result);

    }

    //cigar = 0, weekend = true....false
    @Test
    public void cigarParty_zeroCigar_weekend_shouldReturnFalse(){
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean result = cigarParty.haveParty(0,true);

        //Assert
        Assert.assertFalse(result);

    }

    //cigar = 40, weekend = true....true
    @Test
    public void cigarParty_minimumCigar_weekend_shouldReturnTrue(){
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean result = cigarParty.haveParty(40,true);

        //Assert
        Assert.assertTrue(result);

    }

    //cigar = 40, weekend = false....true
    @Test
    public void cigarParty_minimumCigar_weekdays_shouldReturnTrue(){
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean result = cigarParty.haveParty(40,false);

        //Assert
        Assert.assertTrue(result);

    }

    //cigar = 60, weekend = true....true

    @Test
    public void cigarParty_maximumCigar_weekend_shouldReturnTrue(){
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean result = cigarParty.haveParty(60,true);

        //Assert
        Assert.assertTrue(result);

    }

    // cigar = 60, weekend = false....true
    @Test
    public void cigarParty_maximumCigar_weekdays_shouldReturnTrue(){
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean result = cigarParty.haveParty(60,false);

        //Assert
        Assert.assertTrue(result);

    }

    //cigar = 10000000, weekend = true....true
    @Test
    public void cigarParty_ManyCigar_weekdays_shouldReturnTrue(){
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean result = cigarParty.haveParty(10000000,true);

        //Assert
        Assert.assertTrue(result);

    }

    //cigar = 10000000, weekend = false....false
    @Test
    public void cigarParty_ManyCigars_weekend_shouldReturnFalse(){
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean result = cigarParty.haveParty(10000000,false);

        //Assert
        Assert.assertFalse(result);

    }

    //cigars = 39    weekend = true;
    @Test
    public void cigarParty_shouldReturnFalse(){
         //Arrange
        CigarParty cigarParty = new CigarParty();

         //Act
        boolean result = cigarParty.haveParty(39,true);

        //Assert
        Assert.assertFalse(result);

}
    //cigars = 41    weekend = true;
    @Test
    public void cigarParty_correctOutPut1_shouldReturnFalse(){
        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean result = cigarParty.haveParty(41,true);

        //Assert
        Assert.assertTrue(result);

    }

}

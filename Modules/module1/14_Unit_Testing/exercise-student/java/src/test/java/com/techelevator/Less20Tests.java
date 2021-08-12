package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests {

    //oneLessThanMultipleOf20 returns true
    @Test
    public void less20Test_oneLessThanMultipleOf20_returnsTrue(){
        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean result = less20.isLessThanMultipleOf20(19);

        //Assert
        Assert.assertTrue(result);

    }

    //twoLessThanMultipleOf20 returns true
    @Test
    public void less20Test_twoLessThanMultipleOf20_returnsTrue(){
        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean result = less20.isLessThanMultipleOf20(18);

        //Assert
        Assert.assertTrue(result);

    }

    //MultipleOf20 returns false
    @Test
    public void less20Test_multipleOf20_returnsFalse(){
        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean result = less20.isLessThanMultipleOf20(20);

        //Assert
        Assert.assertFalse(result);

    }

    //0 returns false
    @Test
    public void less20Test_zero_returnsFalse(){
        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean result = less20.isLessThanMultipleOf20(0);

        //Assert
        Assert.assertFalse(result);

    }

    //negative multipleOf20 returns false
    @Test
    public void less20Test_negativeMultipleOf20_returnsFalse(){
        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean result = less20.isLessThanMultipleOf20(-20);

        //Assert
        Assert.assertFalse(result);

    }

    //negative oneLessThanMultipleOf20 returns true
    @Test
    public void less20Test_negativeOneLessThanMultipleOf20_returnFalse(){
        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean result = less20.isLessThanMultipleOf20(-19);

        //Assert
        Assert.assertFalse(result);

    }

    //negative twoLessThanMultipleOf20 returns true
    @Test
    public void less20Test_negativeTwoLessThanMultipleOf20_returnsFalse(){
        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean result = less20.isLessThanMultipleOf20(-18);

        //Assert
        Assert.assertFalse(result);

    }
}

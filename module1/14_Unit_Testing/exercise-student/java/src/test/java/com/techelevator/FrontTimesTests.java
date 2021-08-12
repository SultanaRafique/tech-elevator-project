package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTests {

    @Test
    public void FrontTimesTest_emptyString_returns_emptyString(){
        //Arrange
        FrontTimes fontTest = new FrontTimes();
        String expected = "";

        //Act
        String Actual = fontTest.generateString("", 20);

        //Assert
        Assert.assertEquals(expected, Actual);
    }

    @Test
    public void FrontTimesTest_nNegativeValue_Returns_emptyString(){
        //Arrange
        FrontTimes fontTest = new FrontTimes();
        String expected = "";

        //Act
        String Actual = fontTest.generateString("Abcdefghi", -1);

        //Assert
        Assert.assertEquals(expected, Actual);
    }

    @Test
    public void FrontTimesTest_lessThan3charString_returns_fullStringNTimes(){
        //Arrange
        FrontTimes fontTest = new FrontTimes();
        String expected = "acac";

        //Act
        String Actual = fontTest.generateString("ac", 2);

        //Assert
        Assert.assertEquals(expected, Actual);
    }
    @Test
    public void FrontTimesTest_1charString_returns_1charNTimes() {
        //Arrange
        FrontTimes fontTest = new FrontTimes();
        String expected = "aaaaaaaaaa";

        //Act
        String Actual = fontTest.generateString("a", 10);

        //Assert
        Assert.assertEquals(expected, Actual);

    }

    // empty String, negative n value
    @Test
    public void FrontTimesTest_emptyString_nNegative_returns_emptyString() {
        //Arrange
        FrontTimes fontTest = new FrontTimes();
        String expected = "";

        //Act
        String Actual = fontTest.generateString("", -1);

        //Assert
        Assert.assertEquals(expected, Actual);

    }

    // big String with large n value.
    @Test
    public void FrontTimesTest_bigString_nLargeNegative_returns_fullStringNTimes() {
        //Arrange
        FrontTimes fontTest = new FrontTimes();
        String expected = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc" +
                "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc" +
                "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc" +
                "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc" +
                "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc";

        //Act
        String Actual = fontTest.generateString("abcdefghijklmnopqrstuvwxyz", 100);

        //Assert
        Assert.assertEquals(expected, Actual);


    }

}

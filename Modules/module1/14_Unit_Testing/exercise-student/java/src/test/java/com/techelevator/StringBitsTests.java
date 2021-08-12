package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests {

//    so "Hello" yields "Hlo". GetBits("Hello") → "Hlo" GetBits("Hi")
//
//	 * → "H" GetBits("Heeololeo") → "Hello"

    @Test
    public void StringBitsTest_Hello_returns_Hlo(){
        //Arrange
        StringBits stringBits = new StringBits();
        String Expected = "Hlo";

        //Action
        String Actual = stringBits.getBits("Hello");

        //Assert
        Assert.assertEquals(Expected, Actual);

    }

    @Test
    public void StringBitsTest_Hi_returns_H(){
        //Arrange
        StringBits stringBits = new StringBits();
        String Expected = "H";

        //Action
        String Actual = stringBits.getBits("Hi");

        //Assert
        Assert.assertEquals(Expected, Actual);

    }

    @Test
    public void StringBitsTest_Heeololeo_returns_Hello(){
        //Arrange
        StringBits stringBits = new StringBits();
        String Expected = "Hello";

        //Action
        String Actual = stringBits.getBits("Heeololeo");

        //Assert
        Assert.assertEquals(Expected, Actual);

    }

    @Test
    public void StringBitsTest_12345_returns_135(){
        //Arrange
        StringBits stringBits = new StringBits();
        String Expected = "135";

        //Action
        String Actual = stringBits.getBits("12345");

        //Assert
        Assert.assertEquals(Expected, Actual);

    }

    @Test
    public void StringBitsTest_4underscores_returns_2underscores(){
        //Arrange
        StringBits stringBits = new StringBits();
        String Expected = "__";

        //Action
        String Actual = stringBits.getBits("____");

        //Assert
        Assert.assertEquals(Expected, Actual);

    }

    @Test
    public void StringBitsTest_singlr_letter_returns_single_letter(){
        //Arrange
        StringBits stringBits = new StringBits();
        String Expected = "a";

        //Action
        String Actual = stringBits.getBits("a");

        //Assert
        Assert.assertEquals(Expected, Actual);

    }
}

package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {

    //array elements all 3.
    @Test
    public void lucky13Test_allArrayElements3_returnsFalse(){
        //arrange
        Lucky13 lucky13 = new Lucky13();

        //act
        boolean result = lucky13.getLucky(new int[]{3, 3, 3, 3});

        //assert
        Assert.assertFalse(result);
    }

    //array elements all 1.
    @Test
    public void lucky13Test_allArrayElements1_returnsFalse(){
        //arrange
        Lucky13 lucky13 = new Lucky13();

        //act
        boolean result = lucky13.getLucky(new int[]{1, 1, 1, 1});

        //assert
        Assert.assertFalse(result);
    }

    //array with only 1 element.
    @Test
    public void lucky13Test_ArrayElement1_returnsFalse(){
        //arrange
        Lucky13 lucky13 = new Lucky13();

        //act
        boolean result = lucky13.getLucky(new int[]{1});

        //assert
        Assert.assertFalse(result);
    }

    //array with only 3 element.
    @Test
    public void lucky13Test_ArrayElement3_returnsFalse(){
        //arrange
        Lucky13 lucky13 = new Lucky13();

        //act
        boolean result = lucky13.getLucky(new int[]{3});

        //assert
        Assert.assertFalse(result);
    }

    //array with one zero element.
    @Test
    public void lucky13Test_arrayElementZero_returnsTrue(){
        //arrange
        Lucky13 lucky13 = new Lucky13();

        //act
        boolean result = lucky13.getLucky(new int[]{0});

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void  lucky13Test_allArrayElementZero_returnsTrue(){
        //arrange
        Lucky13 lucky13 = new Lucky13();

        //act
        boolean result = lucky13.getLucky(new int[]{0, 0, 0, 0, 0, 0, 0, 0});

        //assert
        Assert.assertTrue(result);
    }

    //negative array elements
    @Test
    public void lucky13Test_negativeArrayElements_returnsTrue(){
        //arrange
        Lucky13 lucky13 = new Lucky13();

        //act
        boolean result = lucky13.getLucky(new int[]{-1, -3, -1});

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void lucky13Test_emptyArray_returnsTrue(){
        //arrange
        Lucky13 lucky13 = new Lucky13();

        //act
        boolean result = lucky13.getLucky(new int[]{});

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void lucky13Test_null_input_returnsTrue(){
        //arrange
        Lucky13 lucky13 = new Lucky13();

        //act
        boolean result = lucky13.getLucky(null);

        //assert
        Assert.assertTrue(result);
    }


}

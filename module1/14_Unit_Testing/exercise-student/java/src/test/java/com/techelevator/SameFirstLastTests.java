package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTests {
//    IsItTheSame([1, 2, 3]) → false
//    IsItTheSame([1, 2, 3, 1]) → true
//    IsItTheSame([1, 2, 1]) → true

    @Test
    public void SameFirstLastTests_null_input_returnsFalse(){
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();

        //Action
        boolean Expected = sameFirstLast.isItTheSame(null);

        //Assert
        Assert.assertFalse(Expected);
    }

    @Test
    public void SameFirstLastTests_same_number_array_returnsTrue(){
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] input = {1, 1, 1, 1, 1, 1, 1};

        //Action
        boolean Expected = sameFirstLast.isItTheSame(input);

        //Assert
        Assert.assertTrue(Expected);
    }

    @Test
    public void SameFirstLastTests_valid_input_returnsTrue(){
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] input = {1, 2, 3, 4,  5, 6, 1};

        //Action
        boolean Expected = sameFirstLast.isItTheSame(input);

        //Assert
        Assert.assertTrue(Expected);
    }

    @Test
    public void SameFirstLastTests_two_same_element_Array_returnsTrue(){
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] input = {2,2};

        //Action
        boolean Expected = sameFirstLast.isItTheSame(input);

        //Assert
        Assert.assertTrue(Expected);
    }

    @Test
    public void SameFirstLastTests_two_different_element_Array_returnsFalse(){
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] input = {1,2};

        //Action
        boolean Expected = sameFirstLast.isItTheSame(input);

        //Assert
        Assert.assertFalse(Expected);
    }
}

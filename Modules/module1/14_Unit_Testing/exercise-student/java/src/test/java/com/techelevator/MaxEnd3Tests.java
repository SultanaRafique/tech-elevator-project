package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests {

    @Test
    public void maxEnd3Test_valid_input_returns_valid_output(){
        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] expected = {3, 3, 3};

        //Act
        int[] Actual = maxEnd3.makeArray(new int[]{1, 2, 3});

        //Assert
        Assert.assertArrayEquals(expected, Actual);

    }

    @Test
    public void maxEnd3Test_same_element_array_returns_valid_output(){
        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] expected = {3, 3, 3};

        //Act
        int[] Actual = maxEnd3.makeArray(new int[]{3, 3, 3});

        //Assert
        Assert.assertArrayEquals(expected, Actual);

    }

    @Test
    public void maxEnd3Test_negative_element_array_returns_valid_output(){
        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] expected = {-1, -1, -1};

        //Act
        int[] Actual = maxEnd3.makeArray(new int[]{-1, -2, -3});

        //Assert
        Assert.assertArrayEquals(expected, Actual);
    }

    @Test
    public void maxEnd3Test_zero_element_array_returns_same_array(){
        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] expected = {0, 0, 0};

        //Act
        int[] Actual = maxEnd3.makeArray(new int[]{0, 0, 0});

        //Assert
        Assert.assertArrayEquals(expected, Actual);
    }

    @Test
    public void maxEnd3Test_negative_positive_element_array_returns_valid_output(){
        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] expected = {1, 1, 1};

        //Act
        int[] Actual = maxEnd3.makeArray(new int[]{-1, 0, 1});

        //Assert
        Assert.assertArrayEquals(expected, Actual);
    }


}

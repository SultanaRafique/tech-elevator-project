package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTests {


    @Test
    public void WordCount_Test_null_input_returns_null(){
        //Arrange
        WordCount wordCount = new WordCount();

        //Act
        Object result = wordCount.getCount(null);

        //Assert
        Assert.assertNull(result);

    }
    @Test
    public void WordCount_valid_input_returns_valid_output(){
        //Arrange
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("ba" , 2);
        expected.put("black", 1);
        expected.put("sheep", 1);

        //Act
        Map<String, Integer> Actual = wordCount.getCount(new String[]{"ba", "ba", "black", "sheep"});

        //Assert
        Assert.assertEquals(expected, Actual);

    }

    @Test
    public void WordCount_sigleCharString_returns_valid_output(){
        //Arrange
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put( "c", 1);

        //Act
        Map<String, Integer> Actual = wordCount.getCount(new String[]{"c", "b", "a", "b", "a"});

        //Assert
        Assert.assertEquals(expected, Actual);

    }

    @Test
    public void WordCount_numberString_array_returns_valid_output(){
        //Arrange
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("1", 1);
        expected.put("2", 1);
        expected.put("3", 1);

        //Act
        Map<String, Integer> Actual = wordCount.getCount(new String[]{"1", "2", "3"});

        //Assert
        Assert.assertEquals(expected, Actual);

    }

    @Test
    public void WordCount_empty_array_returns_empty_map(){
        //Arrange
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();

        //Act
        Map<String, Integer> Actual = wordCount.getCount(new String[0]);

        //Assert
        Assert.assertEquals(expected, Actual);

    }

}

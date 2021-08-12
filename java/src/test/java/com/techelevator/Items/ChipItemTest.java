package com.techelevator.Items;

import org.junit.Assert;
import org.junit.Test;

public class ChipItemTest {

    @Test
    public void displayPrice_withValidData_shouldReturnCorrectValue() {
        ChipItem chipItem = new ChipItem();
        chipItem.setPrice(100);
        double expected = 1.0;

        double result = chipItem.displayPrice();

        Assert.assertEquals(expected, result, 1);
    }

    @Test
    public void displayPrice_withLargePrice_shouldReturnCorrectValue() {
        ChipItem chipItem = new ChipItem();
        chipItem.setPrice(1000000);
        double expected = 10000.0;

        double result = chipItem.displayPrice();

        Assert.assertEquals(expected, result, 1);
    }

    @Test
    public void displayPrice_withNegativePrice_shouldReturnCorrectValue() {
        ChipItem chipItem = new ChipItem();
        chipItem.setPrice(-100);
        double expected = -1.0;

        double result = chipItem.displayPrice();

        Assert.assertEquals(expected, result, 1);
    }

}


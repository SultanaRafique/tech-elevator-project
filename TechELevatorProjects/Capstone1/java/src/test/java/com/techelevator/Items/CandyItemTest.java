package com.techelevator.Items;

import org.junit.Assert;
import org.junit.Test;

public class CandyItemTest {

    @Test
    public void displayPrice_withValidData_shouldReturnCorrectValue() {
        CandyItem candyItem = new CandyItem();
        candyItem.setPrice(100);
        double expected = 1.0;

        double result = candyItem.displayPrice();

        Assert.assertEquals(expected, result, 1);
    }

    @Test
    public void displayPrice_withLargeData_shouldReturnCorrectValue() {
        CandyItem candyItem = new CandyItem();
        candyItem.setPrice(1000000);
        double expected = 10000.0;

        double result = candyItem.displayPrice();

        Assert.assertEquals(expected, result, 1);
    }

    @Test
    public void displayPrice_withNegativeValue_shouldReturnCorrectValue() {
        CandyItem candyItem = new CandyItem();
        candyItem.setPrice(-100);
        double expected = -1.0;

        double result = candyItem.displayPrice();

        Assert.assertEquals(expected, result, 1);
    }

}

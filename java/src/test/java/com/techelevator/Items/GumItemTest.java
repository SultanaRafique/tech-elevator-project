package com.techelevator.Items;

import org.junit.Assert;
import org.junit.Test;

public class GumItemTest {

    @Test
    public void displayPrice_withValidData_shouldReturnCorrectValue() {
        GumItem gumItem = new GumItem();
        gumItem.setPrice(100);
        double expected = 1.0;

        double result = gumItem.displayPrice();

        Assert.assertEquals(expected, result, 1);
    }

    @Test
    public void displayPrice_withLargePrice_shouldReturnCorrectValue() {
        GumItem gumItem = new GumItem();
        gumItem.setPrice(1000000);
        double expected = 10000.0;

        double result = gumItem.displayPrice();

        Assert.assertEquals(expected, result, 1);
    }

    @Test
    public void displayPrice_withNegativePrice_shouldReturnCorrectValue() {
        GumItem gumItem = new GumItem();
        gumItem.setPrice(-100);
        double expected = -1.0;

        double result = gumItem.displayPrice();

        Assert.assertEquals(expected, result, 1);
    }
}

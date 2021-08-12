package com.techelevator.Items;

import org.junit.Assert;
import org.junit.Test;

public class DrinkItemTest {

    @Test
    public void displayPrice_withValidData_shouldReturnCorrectValue() {
        DrinkItem drinkItem = new DrinkItem();
        drinkItem.setPrice(100);
        double expected = 1.0;

        double result = drinkItem.displayPrice();

        Assert.assertEquals(expected, result, 1);
    }

    @Test
    public void displayPrice_withLargePrice_shouldReturnCorrectValue() {
        DrinkItem drinkItem = new DrinkItem();
        drinkItem.setPrice(1000000);
        double expected = 10000.0;

        double result = drinkItem.displayPrice();

        Assert.assertEquals(expected, result, 1);
    }

    @Test
    public void displayPrice_withNegativePrice_shouldReturnCorrectValue() {
        DrinkItem drinkItem = new DrinkItem();
        drinkItem.setPrice(-100);
        double expected = -1.0;

        double result = drinkItem.displayPrice();

        Assert.assertEquals(expected, result, 1);
    }
}

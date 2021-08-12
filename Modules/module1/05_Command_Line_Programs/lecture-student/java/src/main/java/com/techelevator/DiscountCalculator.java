package com.techelevator;

import java.util.ArrayList;
import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        double discount = Double.parseDouble(scanner.nextLine());
        System.out.println("The discount you typed: " + discount);



        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");

        // storing input in String array;
        String[] priceSeries =scanner.nextLine().split(" ");
        int len = priceSeries.length;

        //converting String arrya to int array.
        int[] priceSeriesInt = new int[len];
        for(int i = 0; i < len; i++){
            priceSeriesInt[i] = Integer.parseInt(priceSeries[i]);
        }
        //Display price user entered:
        System.out.print("The prices you entered are: ");
        for(int i = 0; i < len; i++){
            System.out.print(priceSeriesInt[i] + " ");
        }
        System.out.println();

        //prices after discount
        System.out.print("Prices After discount are: ");
        double [] discountPrice = new double[len];
        for(int i = 0; i < len; i++){
           double discountedPrice = priceSeriesInt [i] * (discount / 100);
           discountPrice[i] = discountedPrice;
           System.out.print(discountedPrice + " ");
        }

    }

}
package com.techelevator;


import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        String inputAmount = myInput.nextLine();
        System.out.println("You typed: " + inputAmount);
        int amount = Integer.parseInt(inputAmount);
        System.out.println(amount + " + 5 = "+ (amount + 5));
//        double amount = Double.parseDouble(inputAmount);
//        System.out.println(amount + " + 5.1 = "+ (amount + 5.1));


/*
        // using nextInt
        System.out.print("Enter a number): ");
        int inputNumber = myInput.nextInt();
        System.out.println("You typed: " + inputNumber);

        String dummyInput = myInput.nextLine();

        System.out.print("Enter name: ");
        String name = myInput.nextLine();
        System.out.println("Hello " + name);
*/


        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");

        //

        Integer num = 3;

        int intNum = Integer.parseInt("7");

        double doubleNum = Double.parseDouble("5.2");








    }

}
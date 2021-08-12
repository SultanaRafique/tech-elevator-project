package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//read a number
		System.out.print("Please enter a number: ");

		// convert String number to integer number.
		int num = Integer.parseInt(sc.nextLine());
		System.out.println();

		//calling method
		Fibonacci fb = new Fibonacci();
		fb.bruteFibbonachi(num);

	}




	// brute force
	public void bruteFibbonachi(int number) {

		// create 3 variables to store 1st, second and 3rd numbers of fibbonachi series.
		//initialize 3rd to zero, later we will reassign it addition of 1st and 2nd number
		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber = 0;

		//create boolean variable to tell if number is zero or negative
		boolean numNegOrZero = (number == 0)|| (number < 0);

		// number zero or negative, return zero
		if(numNegOrZero) {
			System.out.println(firstNumber);
			return;
		}

		//check if first number is less than or equal to given number, if yes, print it, then
		// swap values like, 3rd is equal to addition of 1st and 2nd
		//1st equal to 2nd
		//2nd equal to third
		//check if first number is less than or equal to given number, if no, come out of loop.

		while(firstNumber <= number ){

			System.out.print(firstNumber + " ");
			thirdNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;

		}


	}

}

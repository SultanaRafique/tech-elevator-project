package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

//	Part Two: Create a FizzWriter program
//	Create a program that writes out the result of FizzBuzz (1 to 300) to a file.
//
//	Note: this version of FizzBuzz has additional requirements.
//
//	If the number is divisible by 3, or contains a 3, print Fizz.
//	If the number is divisible by 5, or contains a 5, print Buzz.
//	If the number is divisible by 3 and 5, print FizzBuzz.
//	Otherwise, print the number.
//	The program must prompt the user for the following values:
//
//	The destination file
//	If the file already exists, it must be overwritten. If the user enters an invalid destination file, the program indicates this and exits.
//	The tests for this exercise are in the file src/test/java/com/techelevator/FizzWriterTests.java. All tests must pass to complete this exercise.

	public static void main(String[] args) {

		FizzWriter fizzWriter = new FizzWriter();
		System.out.println("Enter destination File: ");
		Scanner scanner = new Scanner(System.in);

		String userPath = scanner.nextLine();

		fizzWriter.fizzWriter300(userPath);

	}

	 public void fizzWriter300(String userPath){
		 File file =new File(userPath);
		 try {
			 PrintWriter writer = new PrintWriter(file);
			 int number = 1;

			 while(number <= 300){
			 	if(number % 5 == 0 && number % 3 == 0){
					writer.println("FizzBuzz");


				}else if(number % 3 == 0 || contains3(number)){
					writer.println("Fizz");


				}else if(number % 5 == 0 || contains5(number)){
					writer.println("Buzz");

				}else{
					writer.println(number);
				}

				 number++;

			 }

			 writer.flush();
			 writer.close();
		 } catch (FileNotFoundException e) {
			 System.out.println(e.getMessage());
		 }
	 }

	 public boolean contains3(int number){
		return Integer.toString(number).contains("3");
	 }

	public boolean contains5(int number){
		return Integer.toString(number).contains("5");
	}

}

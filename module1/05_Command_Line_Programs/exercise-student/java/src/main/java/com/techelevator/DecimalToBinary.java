package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		//read series of decimal values in string array.
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		Scanner sc = new Scanner(System.in);
		String[] inputNumbers = sc.nextLine().split(" ");

		// convert string array to int array
		int len = inputNumbers.length;
		int[] intiInputNumbers = new int[len];
		for(int i = 0; i < len; i++){
			intiInputNumbers[i] = Integer.parseInt(inputNumbers[i]);
		}

		// call method by passing int array.
		DecimalToBinary deciToBi = new DecimalToBinary();
		deciToBi.convertDeciToBi(intiInputNumbers);

	}

	public void convertDeciToBi(int[] deciArray){
		// create int array to store bits of binary numbers
		int deciLen = deciArray.length;
		int[] binaryNum = new int[50];

		//traverse loop through array of decimal numbers
		for(int i = 0; i < deciLen; i++){
			//create a variable to store number to be convert to binary
			int deciNum = deciArray[i];

			//declare a variable to index to put bits into binaryNum array
			int index = 0;

			//run a while loop until num is positive number
			while(deciNum > 0){

				//calculate remainder, store it in binaryNum array
				//half the number
				//increment index variable(it will be equal to length of binaryNum array

				int remainder = deciNum % 2;
				binaryNum[index] = remainder;
				deciNum /= 2;
				index++;
			}

			System.out.print(deciArray[i] + " in binary is ");

			//read the bits of binaryNum array in reverse order, using same index variable.
			for(int j = index - 1; j >= 0; j--){
				System.out.print(binaryNum[j]);
			}

			System.out.println("");
		}

	}

}

package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {

		// read series of earth weight as space separated string.
		System.out.print("Enter a series of Earth weights (space-separated): ");
		Scanner sc = new Scanner(System.in);

		//covert string to string array by splitting at space
		String[] earthaWeight = sc.nextLine().split(" ");

		//create int array convert string numbers to int numbers and store in intEarthWt array
		int len = earthaWeight.length;
		int[] intEarthWt = new int[len];
		for(int i = 0; i < len; i++){
			intEarthWt[i] = Integer.parseInt(earthaWeight[i]);
		}

		// call the method calculateMartinWt() by passing intEarthWt array.
		MartianWeight martinWt = new MartianWeight();
		martinWt.calculateMartinWt(intEarthWt);
	}

	public void calculateMartinWt(int[] earthWtNums){

		int len = earthWtNums.length;
		for(int i = 0; i < len; i++ ){

			//calculate weight on mars
			int Wm = (int)(earthWtNums[i] * 0.378);

			//display result
			System.out.println(earthWtNums[i]+" lbs. on Earth, is "+Wm +" lbs. on Mars.");
		}
	}

}

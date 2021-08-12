package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {


		// read length
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the length: ");
		int length = Integer.parseInt(sc.nextLine());
		System.out.println();

		// read meter or feet.
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String meterOrFeet = sc.nextLine();
		System.out.println();

		//create object of class and call method on it and displar result.
		LinearConvert lenearConv = new LinearConvert();
		String result = lenearConv.linearConversion(length,  meterOrFeet );
		System.out.println(length + meterOrFeet +" is " + result );

	}




	public String linearConversion(int inputLength, String MtrOrFt) {

		if(MtrOrFt.equals("m")){

			int feet = (int)(inputLength * 3.2808399);
			return feet + "f";
		}else{

			int meter = (int)(inputLength * 0.3048);
			return meter + "m";
		}

	}

}






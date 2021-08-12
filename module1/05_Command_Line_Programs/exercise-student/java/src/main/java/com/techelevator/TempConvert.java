package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		// read temperature
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");
		int temp = Integer.parseInt(sc.nextLine());
		System.out.println();

		//read "C" or "F"
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String celOrFeh = sc.nextLine();

		// creating class object, calling calling method on it and displaying result
		TempConvert tempconv = new TempConvert();
		String resultTemp = tempconv.tempConvert(56, "F");
		System.out.println(temp + celOrFeh +" is " + tempconv.tempConvert(temp, celOrFeh ));

	}



	public String tempConvert(int temp, String cOrF){
		if(cOrF.equals("C")){
			int Tf = (int)(temp * 1.8 + 32);
			return Tf+"F";
		}else{
			int Tc = (int)((temp - 32) / 1.8);
			return Tc+"C";
		}
	}

}

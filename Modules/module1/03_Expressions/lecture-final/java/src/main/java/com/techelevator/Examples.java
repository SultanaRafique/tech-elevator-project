package com.techelevator;

import java.awt.*;

public class Examples {

	public static void main(String[] args) {
		Lecture lecture = new Lecture();
		System.out.println(lecture.returnName());
		System.out.println(lecture.returnName());

		System.out.println(lecture.returnHelloName("Yoav"));
		System.out.println(lecture.returnHelloName("Rich"));

		lecture.printHelloName("Donna");

		System.out.println(lecture.returnNameOfLanguage());

//		System.out.println(lecture.returnTrueWhenGreaterThanFive(2));
		boolean value = lecture.returnTrueWhenGreaterThanFive(2);
		System.out.println(value);

	}

	static boolean shouldBurnDownTheBuilding(int numberOfEmployees, int piecesOfCake) {
		if (numberOfEmployees > piecesOfCake) {
			return true;
		} else {
			return false;
		}
	}
}

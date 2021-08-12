package com.techelevator;

import java.awt.*;
import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		String hello1="Hello World";


		// the funkiness here is because the Java compiler sometimes
		// uses some optimizations that will cause a later example to fail if we don't
		// do this to gforce the behavior we are trying to demoi
		String hello2="Hello";
		hello2 +=" ";
		hello2 += "World";


		// String length() method returns int with length of String
		System.out.println(hello1);
		System.out.println("Length of hello1 is " + hello1.length() );

		// String charAt method takes an int as a param and will return the char at that index in the String
		System.out.println(hello1.charAt(6));


		String myIndexOfExample = "Hi there Tech Elevator Students!";

		// indexOf takes a param and will return the index of the first occurance
		// of the string passed as the param in the original String
		// if there is not match, -1 will be returned
		int index = myIndexOfExample.indexOf("Tech Elevator");
		System.out.println(index);

		System.out.println(myIndexOfExample.indexOf("Monday"));


		// lastIndex does the same for the last occurance
		System.out.println(myIndexOfExample.lastIndexOf("e"));


		// contains returns a boolean indicating the string specified is contained
		// in the original String
		boolean foundElevator = myIndexOfExample.contains("Elevator");
		System.out.println(foundElevator);

		boolean foundEscalator = myIndexOfExample.contains("Escalator");
		System.out.println(foundEscalator);

		// toUpperCase() / toLowerCase()  will return an all caps / all lower
		// version of the String
		System.out.println(myIndexOfExample.toUpperCase());
		System.out.println(hello1.toUpperCase());



		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();
//
//
//		/* Other commonly used methods:
//		 *
//		 * endsWith
//		 * startsWith
//		 * indexOf
//		 * lastIndexOf
//		 * length
//		 * split
//		 * substring
//		 * toLowerCase
//		 * toUpperCase
//		 * trim
//		 */

		// length()
		String stringExample = "Hi there Tech Elevator Students!";
		System.out.println("stringExample.length(): " + stringExample.length());

		// indexOf
		int indexVal = stringExample.indexOf("T");
		System.out.println(indexVal);

		// use index to retrieve char using charAt
		char tChar = stringExample.charAt(indexVal);
		System.out.println("tChar: " + tChar);

		// startsWith return true or false based on whether the original
		// String starts with the text specified in the param
		boolean startsWithHi = stringExample.startsWith("Hi");
		System.out.println("startsWithHi: " + startsWithHi);

		boolean startsWithBye = stringExample.startsWith("Bye");
		System.out.println("startsWithBye: " + startsWithBye);

		// endsWith does a similar but checks it the Strings ends with the specified String
		boolean endsWithStudents = stringExample.endsWith("Students!");
		System.out.println("endsWithStudents: " + endsWithStudents);

		boolean endWithHi = stringExample.endsWith("Hi");
		System.out.println("endWithHi: " + endWithHi);

		int indexOfHi = stringExample.indexOf("Hi");
		System.out.println(indexOfHi);

		// if incexOf cannout find the specified string, it will return -1
		int indexofBye = stringExample.indexOf("Bye");
		System.out.println("indexofBye: " + indexofBye);

		// the split method of String will use a delimiter and will break
		// a String that uses that delimiter into an array;
		String mySplitExample = "One,two,three";
		// split using comman
		String[] splitExampleArray = mySplitExample.split(",");
		System.out.println(splitExampleArray.length);

		// sp;lit using space
		String split2 = "The quick brown fox jumped over the lazy dog";
		String[] wordsArray = split2.split(" ");
		System.out.println(wordsArray.length);

		System.out.println(split2.toUpperCase());
		System.out.println(split2.toLowerCase());


		// trim removes leading and trailing spaces
		String trimExample = "      text     ";
		String trimmed = trimExample.trim();
		System.out.println(trimmed + " length: " + trimmed.length());


		// substring

		String subExample = "This is a super fun String";

		// substring returns the substring starting an the index specified in the first
		// param and ending at the index RIGHT BEFORE the index specified as the second param
		String superString = subExample.substring(10, 15);
		System.out.println(superString);

		// alternate version substring with one param will return a substring
		// starting at the specified index and going to the end of the String
		System.out.println(subExample.substring(10));

		// immutablity
		String funString1 = "This is fun!";
		String funStringSubResult = funString1.substring(8);
		System.out.println("funString1: " + funString1);
		System.out.println("funStringSubResult: " + funStringSubResult);



//
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();



		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}


		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String[] array1 = {"Hi", "there", "everyone!"};

		// assigning array1 to array2 only assigns the REFERENCE to the data
		// meaning the two variables point to the SAME location on the heap
		String[] array2 = array1;

		// modifying array2 will ALSO modify array1 because
		// they both refer to the same location
		array2[1] = "Howdy";

		System.out.println(array1);

	}
}

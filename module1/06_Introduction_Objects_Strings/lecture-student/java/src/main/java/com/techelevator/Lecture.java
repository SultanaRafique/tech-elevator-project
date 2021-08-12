package com.techelevator;

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
		String hello2="Hello";
		hello2 +=" ";
		hello2 += "World";
		String firstName = "Anjelina";
		String lastName = "Julie";
		System.out.println(firstName + " " + lastName);



		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();


		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */
		System.out.println(firstName.endsWith("Anjelina"));
		System.out.println(firstName.endsWith("A"));
		System.out.println(firstName.endsWith("a"));

		System.out.println(lastName.startsWith("J"));
		System.out.println(lastName.startsWith("Julie"));
		System.out.println(lastName.startsWith("j"));

		System.out.println(firstName.indexOf("l"));
		System.out.println(lastName.lastIndexOf("li"));
		System.out.println(firstName.length());

		System.out.println(firstName.substring(0, 3));
		System.out.println(firstName.toLowerCase());
		System.out.println(lastName.toUpperCase());

		String trimString = "   after trim  ";
		System.out.println(trimString.trim());

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

	}
}

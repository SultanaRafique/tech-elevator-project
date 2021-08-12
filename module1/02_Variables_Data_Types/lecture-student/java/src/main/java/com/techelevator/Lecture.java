package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/

		int numberOfExercises = 26;
		System.out.println(numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/

		double half =0.5;
		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		String name ="TechElevator";
		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		int seasonsOfFirefly =1;
		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		String myFavoriteLanguage ="Java";
		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		double pi = 3.1416;
		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/

		String myName ="Sultana";
		System.out.println(myName);

		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/

		int numberOfButtons = 4;
		System.out.println(numberOfButtons);

		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/

		int batteryPercentInt = 40;
		double batteryPercentDouble = 50.0;
		System.out.println(batteryPercentInt);
		System.out.println(batteryPercentDouble);


		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/

		int difference = 121 - 27;
		System.out.println(difference);

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		44.400000000000006
		*/
		double addition = 12.3 + 32.1;
		System.out.println(addition);

		/*
		12. Create a String that holds your full name.
		*/
		String fullName = " Sultana Rafique";
		System.out.println(fullName);

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		String newName = "Hello, " + fullName;
		System.out.println( newName);

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		fullName = fullName + " Esquire";
		System.out.println(fullName);


		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		String myFullName = "Sultana Rafique";
		myFullName += " Esquire";
		System.out.println(myFullName);

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		 String newVariable = "saw" + 2;
		System.out.println(newVariable);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		newVariable += 0;
		System.out.println(newVariable);

		/*
		18. What is 4.4 divided by 2.2?
		*/

		double result = 4.4 / 2.2;
		System.out.println(result);

		/*
		19. What is 5.4 divided by 2?
		*/
		double doubleResult = 5.4 / 2;
		System.out.println(doubleResult);

		/*
		20. What is 5 divided by 2?
		*/
		int intResult = 5/2;
		System.out.println(intResult);

		/*
		21. What is 5.0 divided by 2?
		*/
		double divisionResult = 5.0 / 2;
		System.out.println(divisionResult);

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		0.6659999999999999
		*/

		double doubleWrongResult = 66.6 / 100;
		System.out.println(doubleWrongResult);

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		int remainder = 5 % 2;
		System.out.println( remainder);

		/*
		24. What is 1,000,000,000 * 3?
		*/

		long multiResult = 1_000_000_000l * 3;
		System.out.println(multiResult);

		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		boolean doneWithExercises = false;
		System.out.println(doneWithExercises);

		/*
		26. Now set doneWithExercise to true.
		*/
		doneWithExercises = true;
		System.out.println(doneWithExercises);

		
	}

}

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
		double half = 0.5;

		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		String name = "TechElevator";

		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		int seasonsOfFirefly = 1;

		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		String myFavoriteLanguage = "Java";

		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		double pi = 3.1416;

		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/
		String myName = "Yoav";

		System.out.println(myName);

		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		int mouseButtons = 4;

		System.out.println(mouseButtons);

		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		int batteryLifepercentAsInt = 50;

		System.out.println(batteryLifepercentAsInt);

		double batteryLifepercentAsDouble = .50;

		System.out.println(batteryLifepercentAsDouble);


		/* demo of mod (%) fdr even / odd
			% gives the remained of a division problem
			we can use this to determine if a number is even
			beacuse any number % 2 will be 0 if it is even
			or 1 or not 0 if it is odd
		 */

		int num10IsEven = 10 % 2;
		int num7IsOdd = 7 % 2;

		System.out.println(num10IsEven);
		System.out.println(num7IsOdd);

		/* assigment operator :
		/*	plus -> +=
		/* will take a variable, evaluate what's on the right ADD it to the variable
		/*
		/* int i = 5;
		/* i = i + 5;
		/* i += 5;
		 */

		int addAsignmentOperator = 7;
//		addAsignmentOperator = addAsignmentOperator + 7;
		addAsignmentOperator += 7;
		System.out.println(addAsignmentOperator);

		/* order of operations */

		int result = 4 + 5 * 20;
		System.out.println(result);

		result = (4 + 5) * 20;
		System.out.println(result);

		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/

		int diff = 121 - 27;
		System.out.println(diff);

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		double additionResult = 12.3 + 32.1;

		System.out.println(additionResult);

		/*
		12. Create a String that holds your full name.
		*/
		String firstName = "Yoav";
		System.out.println(firstName);

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		String helloName = "Hello, " + firstName;
		System.out.println(helloName);

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		String fullName = "Yoav Morahg";
		fullName = fullName + " Esquire";

		// short hand using +=
//		fullName += " Esquire";

		System.out.println(fullName);

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/

		String anotherFullName  = "Yoav Morahg";
		anotherFullName += " Esquire";

		System.out.println(anotherFullName);

		System.out.println(fullName);

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		String saw = "Saw" + 2;
		System.out.println(saw);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		saw += 0;
		System.out.println(saw);

		/*
		18. What is 4.4 divided by 2.2?
		*/
//		double result = 4.4 / 2.2;

		/*
		19. What is 5.4 divided by 2?
		*/

		/*
		20. What is 5 divided by 2?
		*/

		/*
		21. What is 5.0 divided by 2?
		*/

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
			0.6659999999999999
		*/
		double roundingError = 66.6 / 100;
		System.out.println(roundingError);

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		int myRemaineder = 5 % 2;
		System.out.println(myRemaineder);

		/*
		24. What is 1,000,000,000 * 3?
		*/
		int overFlow = 1000000000 * 3;
		System.out.println(overFlow);

		long noOverFlow = 1000000000L * 3;
		System.out.println(noOverFlow);


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

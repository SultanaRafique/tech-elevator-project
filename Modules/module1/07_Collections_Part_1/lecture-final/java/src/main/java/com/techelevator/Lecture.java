package com.techelevator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");


//		List<Integer> myIntList = new ArrayList<>();
//
//		Integer i =  Integer.valueOf(5);


		// Create a list of Strings called names
		List<String> names = new ArrayList<String>();
		names.add("Frodo");
		names.add("Sam");
		names.add("Pippin");
		names.add("Merry");
		names.add("Gandalf");
		names.add("Aragorn");
		names.add("Boromir");
		names.add("Gimli");
		names.add("Legolas");


		// add these names
		/*
		Frodo
		Sam
		Pippin
		Merry
		Gandalf
		Aragorn
		Boromir
		Gimli
		Legolas
		 */

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		// the elements will be returned in the same order they were added
		// loop through to see this
//		for(int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i));
//		}


		// let's create method to dump the array

		dumpStringList(names);

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		// what happens if we add Sam again
		names.add("Sam");

		dumpStringList(names);


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		// add David after Sam
		names.add(2, "David");

		dumpStringList(names);


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		// remove David

		names.remove(2);

		dumpStringList(names);


		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		// use contains to check if list contains an elemwnt`

		boolean containsFrodo = names.contains("Frodo");
		System.out.println("containsFrodo: " + containsFrodo);

		boolean containsYoav = names.contains("Yoav");
		System.out.println("containsYoav: " + containsYoav);


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		// use indexOf to find index of element in list
		System.out.println(names.indexOf("Sam"));
		System.out.println(names.indexOf("Yoav"));


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		// use toArray with a new array of matching type
		String[] listAsArray = names.toArray(new String[0]);
		for(int i = 0; i < listAsArray.length; i++) {
			System.out.println("listAsArray[" + i + "]: " + listAsArray[i]);
		}


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		// use Collections.sort
		// note that this modifies the order of the list - no need to reassign

		Collections.sort(names);

		dumpStringList(names);

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		// Use Collections.reverse
		// note that this modifies the order of the list - no need to reassign

		Collections.reverse(names);

		dumpStringList(names);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		// Let's loop through names again, but this time using a for-each loop
		// for each name in names

		for(String item : names) {
			System.out.println(item);
		}

		System.out.println(names);

		for(String arrayItem : listAsArray) {
			System.out.println("listAsArray: " + arrayItem);
		}

	}

	public static void dumpStringList(List<String> myList) {
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
	}
}

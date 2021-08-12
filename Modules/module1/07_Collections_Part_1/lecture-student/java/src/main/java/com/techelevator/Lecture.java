package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		// Create a list of Strings called names

		List<String> names = new ArrayList<>();
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
		names.add("Frodo");
		names.add("Sam");
		names.add("Pippin");
		names.add("Merry");
		names.add("Gandalf");
		names.add("Aragorn");
		names.add("Boromir");
		names.add("Gimli");
		names.add("Legolas");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		// the elements will be returned in the same order they were added
		// loop through to see this
		for(String item : names){
			System.out.println(item);
		}

		// let's create method to dump the array
		//dumpArray(names);
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		// what happens if we add Sam again
		names.add("Sam");
		dumpArray(names);

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		// add David after Sam
		names.add(2, "David");
		dumpArray(names);

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		// remove David
		names.remove(2);
		dumpArray(names);


		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		// use contains to check if list contains an elemwnt
		System.out.println(names.contains("Sam"));
		System.out.println(names.contains("John"));

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		// use indexOf to find index of element in list
		System.out.println(names.indexOf("Sam"));
		System.out.println(names.indexOf("Ross"));

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		// use toArray with a new array of matching type
		String[] namesArray = names.toArray(new String[0]);
		for(int i = 0; i < namesArray.length; i++){
			System.out.println("[" + i + "]" + namesArray[i]);
		}


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		// use Collections.sort
		// note that this modifies the order of the list - no need to reassign
		Collections.sort(names);
		dumpArray(names);

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		// Use Collections.reverse
		// note that this modifies the order of the list - no need to reassign
		Collections.reverse(names);
		dumpArray(names);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		// Let's loop through names again, but this time using a for-each loop
		// for each name in names
		for(String item : names){
			System.out.println(item);
		}

	}

	public static void dumpArray(List<String> strList){
		for(String item : strList){
			System.out.println(item);
		}
	}
}

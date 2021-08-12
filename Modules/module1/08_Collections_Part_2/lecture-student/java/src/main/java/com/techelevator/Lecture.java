package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		// Declare and initialize a Map called nameToZip with String as key
		//and value types

		Map<String, String> nameToZip = new HashMap<>();

		System.out.println("####################");
		System.out.println("        ADD ENTRIES TO MAP");
		System.out.println("####################");
		System.out.println();



		// add entries
		/*
		key: David,  value: 44120
		key: Dan,  value: 44124
		key: Elizabeth,  value: 44012
		*/

		nameToZip.put("David", "44120");
		nameToZip.put("Dan", "44124");
		nameToZip.put("Elizabeth", "44012");

		System.out.println("####################");
		System.out.println("       RETRIEVING ITEM FROM MAPS");
		System.out.println("####################");
		System.out.println();


		// Retrieving an item from a Map

		String item = nameToZip.get("David");

		System.out.println("####################");
		System.out.println("        KEYSET");
		System.out.println("####################");
		System.out.println();


		// Get keySet
		Set<String> namesZipSet = nameToZip.keySet();

		System.out.println("####################");
		System.out.println("       CHECK IF KEY EXISTS");
		System.out.println("####################");
		System.out.println();

		// Check to see if a key already exists
		String givenKey = "abc";
		for(String nameKey : namesZipSet){

			if(nameKey.equals(givenKey)){
				System.out.println("key exists" + givenKey);
			}

		}
		boolean keyExists = nameToZip.containsKey("David");

		System.out.println("####################");
		System.out.println("        iTERETAE THROUGH KEY-VALUE PAIR IN MAP");
		System.out.println("####################");
		System.out.println();

		// Iterate through the key-value pairs in the Map

		Set<Map.Entry<String, String>> entries = nameToZip.entrySet();

		for(Map.Entry<String, String> entry : entries){

			String key = entry.getKey();
			String value = entry.getValue();

			System.out.println("Key: " + key + "Value: " + value);
		}

		System.out.println("####################");
		System.out.println("        REMOVE ELEMENT FROM MAP");
		System.out.println("####################");
		System.out.println();

		// Remove an element from the Map
		nameToZip.remove("Dan");


		System.out.println("####################");
		System.out.println("        LOOP THROUGH MAP");
		System.out.println("####################");
		System.out.println();
		
		// loop through again to show David was removed
	}

}

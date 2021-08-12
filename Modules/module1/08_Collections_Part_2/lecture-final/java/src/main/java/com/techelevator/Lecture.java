package com.techelevator;


import java.util.HashMap;
import java.util.HashSet;
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
		Map<String, String> nameToZIp = new HashMap<>();


		// add entries
		/*
		key: David,  value: 44120
		key: Dan,  value: 44124
		key: Elizabeth,  value: 44012
		*/

		nameToZIp.put("David", "44120");
		nameToZIp.put("Dan", "44124");
		nameToZIp.put("Elizabeth", "44012");

		// Retrieving an item from a Map
		String dansZip = nameToZIp.get("Dan");
		System.out.println("Dan's zip is: " + dansZip);

		String davidsZip = nameToZIp.get("David");
		System.out.println("David's zip is: " + davidsZip);

		String yoavsZip = nameToZIp.get("Yoav");
		System.out.println("Yoav's zip: " + yoavsZip);

		nameToZIp.put(null, "This is null");
		System.out.println(nameToZIp.get(null));

		// overwrite dans's zip
		nameToZIp.put("Dan", "different");
		dansZip = nameToZIp.get("Dan");
		System.out.println("Dan's zip is: " + dansZip);




		// Check to see if a key already exists
		boolean danExists = nameToZIp.containsKey("Dan");
		boolean yoavExists = nameToZIp.containsKey("Yoav");

		System.out.println("danExists: " + danExists + " yoavExists: " + yoavExists);

		// use size to determina # od elements
		System.out.println("Number of elements: " + nameToZIp.size());


		// Get keySet
		Set<String> keys = nameToZIp.keySet();


		// Iterate through the key-value pairs in the Map
		for (String key : keys) {
			System.out.println(key + " " + nameToZIp.get(key));
		}

		// entry set
		Set<Map.Entry<String, String>> entries = nameToZIp.entrySet();

		for(Map.Entry<String, String> entry : entries) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + " value: " + value);
		}

		for(Map.Entry<String, String> entry : nameToZIp.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + " value: " + value);
		}

		System.out.println(">>>>>>> REMOVE <<<<<<");
		// Remove an element from the Map
		nameToZIp.remove("Dan");
		nameToZIp.remove(null);
		nameToZIp.remove(("Yoav"));

		// loop through again to show David was removed

		for (String key : nameToZIp.keySet()) {
			System.out.println(key);
		}

		System.out.println(">>>>>>>>> SETS <<<<<<<");

		// Declare Set
		Set<String> names = new HashSet<>();
		names.add("Larry");
		names.add("Curly");
		names.add("Moe");

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println(">>>> AFTER ADDING Curly AGAIN <<<<<<");
		names.add("Curly");

		for (String name : names) {
			System.out.println(name);
		}


		System.out.println(">>>>> CHECK IF SET CONTAINS ELEMENT <<<<<");
		boolean containsLarry = names.contains("Larry");
		boolean containsYoav = names.contains("Yoav");

		System.out.println("containsLarry: " + containsLarry + " containsYoav: " + containsYoav);

		System.out.println(">>>>> REMOVE ITEM FROM Set <<<<<");
		names.remove("Moe");

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("Size of names: " + names.size());

		// check for null

		/*

		// won't compile because compiler won't
		// let us declare String without initializing it
		// You MAY run into a situation where you get an
		// that isn't initialized as a parameter or a return
		// value froma method.
		//
		// YOU SHOULD CHECK FOR NULLS WHEN USING OBJECTS... LIKE BELOW
		// IN THE IF CONDITION

		String dummy;
		if (dummy == null) {

		}

		 */
	}

}

package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {

		String result = "unknown";
		if(animalName == null || animalName.isEmpty()){
			return result;
		}

		Map<String, String > animalMap = new HashMap<String, String>();
		animalMap.put("Rhino", "Crash");
		animalMap.put("Giraffe", "Tower");
		animalMap.put("Elephant", "Herd");
		animalMap.put("Lion", "Pride");
		animalMap.put("Crow", "Murder");
		animalMap.put("Pigeon", "Kit");
		animalMap.put("Flamingo", "Pat");
		animalMap.put("Deer", "Herd");
		animalMap.put("Dog", "Pack");
		animalMap.put("Crocodile", "Float");

		Set<String> keySet = animalMap.keySet();

		for(String animalKey : keySet){
			if(animalKey.equalsIgnoreCase(animalName)){
				result = animalMap.get(animalKey);
				return result;
			}
		}
		return result;
	}



	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {
		double result = 0.0;

		if(itemNumber == null || itemNumber.isEmpty()){
			return 0.00;
		}

		Map<String, Double> itemMap = new HashMap<>();
		itemMap.put("KITCHEN4001", 0.20);
		itemMap.put("GARAGE1070", 0.15);
		itemMap.put("LIVINGROOM", 0.10);
		itemMap.put("KITCHEN6073", 0.40);
		itemMap.put("BEDROOM3434", 0.60);
		itemMap.put("BATH0073", 0.15);

		Set<String> itemSet = itemMap.keySet();

		for(String item : itemSet ){

			if(item.equalsIgnoreCase(itemNumber)){
				result = itemMap.get(item);
				return result;
			}
		}
		return result;
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		Integer paulMoney = peterPaul.get("Paul");
		Integer peterMoney = peterPaul.get("Peter");

		boolean paulLess10 = paulMoney < 1000;
		boolean peterMore0 = peterMoney > 0;

		boolean less10More0 = paulLess10 && peterMore0;

		if(less10More0) {

			Integer peterlowMoney = peterPaul.get("Peter") / 2;
			if(peterMoney % 2 != 0){
				peterlowMoney++;
			}
			Integer paulHighMoney = peterPaul.get("Paul") + (peterPaul.get("Peter") / 2);

			peterPaul.put("Peter", peterlowMoney);
			peterPaul.put("Paul", paulHighMoney);

		}

		return peterPaul;
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		Integer peterMoney = peterPaul.get("Peter");
		Integer paulMoney = peterPaul.get("Paul");

		boolean peter50More =  peterMoney >= 50_00;
		boolean paul100More = paulMoney >= 100_00;

		boolean peterPaul50100 = peter50More && paul100More;

		if(peterPaul50100){

			Integer peterMoneyPostP = (peterMoney / 4) * 3;
			Integer paulMoneyPostP = (paulMoney / 4) * 3;
			Integer PartnershipMoney = (peterMoney  / 4) + (paulMoney / 4);

			peterPaul.put("Peter", peterMoneyPostP);
			peterPaul.put("Paul", paulMoneyPostP);
			peterPaul.put("PeterPaulPartnership", PartnershipMoney);
		}
		return peterPaul;
	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		int len = words.length;
		Map<String, String> wordMap = new HashMap<>();

		for(int i = 0; i < len; i++){

			String word = words[i];
			int wordLen = word.length();

			String firstChar = String.valueOf(word.charAt(0));
			String lastChar = String.valueOf(word.charAt(wordLen - 1));

			wordMap.put(firstChar, lastChar);

		}
		return wordMap;
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {

		Map<String, Integer> wordCount = new HashMap<>();

		for( String word : words){
			if(wordCount.containsKey(word)){

				int newVal = wordCount.get(word) + 1;
				wordCount.put(word, newVal);
			}else{
				wordCount.put(word, 1);
			}
		}
		return wordCount;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {

		Map<Integer, Integer> intCountMap = new HashMap<>();
		for(int number : ints){

			if(intCountMap.containsKey(number)){

				int newVal = intCountMap.get(number) + 1;
				intCountMap.put(number, newVal);
			}else{
				intCountMap.put(number, 1);
			}
		}
		return intCountMap;
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {

		Map<String, Boolean> wordMultipleMap = new HashMap<>();
		for(String word : words){

			if(wordMultipleMap.containsKey(word)){
				wordMultipleMap.put(word, true);
			}else{
				wordMultipleMap.put(word, false);
			}
		}
		return wordMultipleMap;
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {

		Map<String, Integer> combineWarehouse = new HashMap<>();
		Set<String> mainWHKeySet = mainWarehouse.keySet();
		Set<String> remoteWHKeySet = remoteWarehouse.keySet();

		for(String mainkey : mainWHKeySet){

			if(remoteWarehouse.containsKey(mainkey)){
				Integer newVal = remoteWarehouse.get(mainkey) + mainWarehouse.get(mainkey);
				combineWarehouse.put(mainkey, newVal);

			}else{
				Integer newVal = mainWarehouse.get(mainkey);
				combineWarehouse.put(mainkey, newVal);
			}
		}

		for(String remoteKey : remoteWHKeySet){
			if(!(mainWarehouse.containsKey(remoteKey))){
				Integer newVal = remoteWarehouse.get(remoteKey);
				combineWarehouse.put(remoteKey, newVal);
			}
		}

		return combineWarehouse;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		int arrayLen = words.length;
		Map<String, Integer> last2RevisitedMap = new HashMap<>();

		for(int i = 0; i < arrayLen; i++){

			Integer count = 0;
			String wordInArray = words[i];
			int wordLen = wordInArray.length();
			String last2 = wordInArray.substring(wordLen - 2, wordLen);

			for(int j = 0; j < wordLen - 3; j++ ){

				String current2 = String.valueOf(wordInArray.charAt(j)) + String.valueOf(wordInArray.charAt(j + 1));
				if(current2.equals(last2)){
					count++;
				}
			}
			last2RevisitedMap.put(wordInArray, count);
		}

		return last2RevisitedMap;
	}

}

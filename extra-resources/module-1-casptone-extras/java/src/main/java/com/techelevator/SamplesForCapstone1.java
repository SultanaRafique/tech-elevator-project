package com.techelevator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SamplesForCapstone1 {
	
	public static void main(String[] args) {
	
		SamplesForCapstone1 samples =
				new SamplesForCapstone1();
		
//		samples.formatSamples();
//		samples.treeMapSample();
//		samples.pipeSample();
//		samples.dateTimeSample();
	}

	public void formatSamples() {
		double num1 = 0.03;
		double num2 = 0.04;
		
		System.out.println(num2 / num1);
		
		
		String myString = String.format("Hi: %s %d $%.2f", "Yoav", 3, num2 / num1);
		System.out.println(myString);
		
	}
	
	public void treeMapSample() {
		// non-order
//		Map<String, String> myMap = new HashMap();
		
		// ordered (default for String key is sorted in ascending alpabetical order
		Map<String, String> myMap = new TreeMap();
		myMap.put("A", "Pennsylvania");
		myMap.put("B", "New York");
		myMap.put("C", "Maryland");
		myMap.put("D", "Delaware");
		
		for (String key : myMap.keySet()) {
			System.out.println("key: " + key + " value: " + myMap.get(key));
		}
		
	}
	
	public void pipeSample() {
		String data = "1|2|3|4|5";
		
		// this does not work
		// to parse pipe split("\\|"):
		String[] parsed = data.split("|");
		System.out.println(parsed.length);
		
		
	}

	public void dateTimeSample() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-YY HH:mm");
		LocalDateTime date = LocalDateTime.now();
		String text = date.format(formatter);
		System.out.println(text);
	}
}
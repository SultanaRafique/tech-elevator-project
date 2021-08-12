package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {

		System.out.println("What is the fully qualified name of the file that should be searched?");
		Scanner scanner = new Scanner(System.in);

		String filePath = scanner.nextLine();
		File myFile = new File(filePath);

		System.out.println("What is the search word you are looking for?");
		String searchWord = scanner.nextLine();

		System.out.println("Should the search be case sensitive? (Y\\\\N)");
		String caseSensitive = scanner.nextLine();

		wordSearch(myFile, searchWord, caseSensitive);

	}

	public static void wordSearch(File searchFile, String word, String caseSensitive){

		int count = 0;

		try(Scanner input = new Scanner(searchFile)){
			while(input.hasNextLine()) {
				count++;

				String line = input.nextLine();

				if (caseSensitive.equals("N")) {
					if (line.toLowerCase().contains(word.toLowerCase())) {
						System.out.println(count + ") " + line);

					}
				}

				if (caseSensitive.equals("Y")) {
					if (line.contains(word)) {
						System.out.println(count + ") " + line);

					}
				}
			}

		}catch(FileNotFoundException ex){
			System.out.println(searchFile + ": Not Found.");
		}

	}

}

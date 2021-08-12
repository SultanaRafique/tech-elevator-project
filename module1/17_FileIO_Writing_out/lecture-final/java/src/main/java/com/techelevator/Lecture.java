package com.techelevator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args)  {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		//inspectingTheFileSystem(userInput);

		/*
		 * The File class also allows us to manipulate file system objects
		 * */

		/* ************************
		 * CREATING A DIRECTORY
		 * ************************/

//		creatingADirectory(userInput);

		/* ************************
		 * CREATING A FILE
		 * ************************/

//		try {
//			creatingAFile(userInput, "myDirectory");
//		} catch (IOException ex) {
//			System.out.println(ex.getMessage());
//		}

		/* ************************
		 * WRITING TO A FILE
		 * ************************/

//		try {
//			writingToAFile(userInput, "myDirectory/myFile.txt");
//		} catch(FileNotFoundException ex) {
//			System.out.println(ex.getMessage());
//		}

		/* ************************
		 * APPENDING TO A FILE
		 * ************************/
//		appendingToAFile(userInput, "myDirectory/myFile.txt");

//		List<String> fruits = getFruits();
//		System.out.println(fruits.size());

		getFruitsWithSeparator();


	}

	public static void inspectingTheFileSystem(Scanner userInput) {
		System.out.print("Enter the path of a file or directory >>> ");
		String path = userInput.nextLine();
		File f = new File(path);
		System.out.println();
		if (f.exists()) { // returns true if a file or directory exists at the file system location, otherwise returns false
			System.out.println("name: " + f.getName());
			System.out.println("absolutePath: " + f.getAbsolutePath());
			if (f.isDirectory()) {
				System.out.println("type: directory");
			} else if (f.isFile()) {
				System.out.println("type: file");
			}
			System.out.println("size : " + f.length());
		} else {
			System.out.println(f.getAbsolutePath() + " does not exist.");
		}
	}

	public static void creatingADirectory(Scanner userInput) {
		System.out.println();
		System.out.println("Let's create a new directory.");
		System.out.print("Enter the path of the new directory >>> ");
		String path = userInput.nextLine();
		File newDirectory = new File(path);

		if (newDirectory.exists()) {
			System.out.println("Sorry, " + newDirectory.getAbsolutePath() + " already exists.");
			System.exit(1);
		} else {
			if (newDirectory.mkdir()) {
				System.out.println("New directory created at " + newDirectory.getAbsolutePath());
			} else {
				System.out.println("Could not create directory.");
				System.exit(1);
			}
		}
	}

	public static void creatingAFile(Scanner userInput, String newDirectory) throws IOException {
		System.out.println();
		System.out.println("Now let's put a file in the directory.");
		System.out.print("Enter a name for the new file >>> ");
		String fileName = userInput.nextLine();
//		File newFile = new File(newDirectory, fileName);
		File newFile = new File(fileName);

		newFile.createNewFile();
		System.out.println();
		System.out.println("name: " + newFile.getName());
		System.out.println("absolutePath: " + newFile.getAbsolutePath());
		System.out.println("size : " + newFile.length());
	}

	public static void writingToAFile(Scanner userInput, String filePath)  throws FileNotFoundException  {
		File newFile = new File(filePath);
		System.out.println();
		System.out.println("Now let's write something in the new file.");
		System.out.print("Enter a message to be stored in the new file >>> ");
		String message = userInput.nextLine();

		try (PrintWriter writer = new PrintWriter(newFile)) {
			writer.println(message);
		} // When we exit the try block, this cause the file to be closed and an automatic flush of the buffer to trigger

		System.out.println();
		System.out.println("name: " + newFile.getName());
		System.out.println("absolutePath: " + newFile.getAbsolutePath());
		System.out.println("size : " + newFile.length());
	}

	public static void appendingToAFile(Scanner userInput, String filePath) {
		File newFile = new File(filePath);
		System.out.println();
		System.out.println("Now let's appending something an existing file.");
		System.out.print("Enter a message to be stored in the new file >>> ");
		String message = userInput.nextLine();

		boolean append = newFile.exists() ? true : false;
		try (PrintWriter writer =
					 new PrintWriter(new FileOutputStream(newFile, append))) {
//			writer.append(message);
			writer.println(message);
		} catch(IOException e) {
			System.out.println("Exception: " + e.getMessage());
		}


	}

	public static List<String> getFruits() {
		List<String> fruitList = new ArrayList<>();
		File fruitFile = new File("mydirectory/funFile.txt");
		try (Scanner inputFile = new Scanner(fruitFile)){
			while(inputFile.hasNextLine()) {
				String fruit = inputFile.nextLine();
				fruitList.add(fruit);
			}

		} catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return fruitList;
	}
	public static List<String[]> getFruitsWithSeparator() {
		List<String[]> fruitList = new ArrayList<>();
		File fruitFile = new File("mydirectory/fruitListCsv.txt");
		try (Scanner inputFile = new Scanner(fruitFile)){
			while(inputFile.hasNextLine()) {
				String fruit = inputFile.nextLine();
				if (fruit != null) {
					String[] fruits = fruit.split(",");
					fruitList.add(fruits);
				}
			}

		} catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return fruitList;
	}





}

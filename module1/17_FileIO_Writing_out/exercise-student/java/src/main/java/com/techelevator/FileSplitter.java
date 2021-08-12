package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {

		System.out.println("Where is the input file (please include the path to the file)?");
		Scanner scanner = new Scanner(System.in);
		String filePath = scanner.nextLine();

		System.out.println("How many lines of text (max) should there be in the split files?");
		int lineNumbers = Integer.parseInt(scanner.nextLine());

		if(lineNumbers < 0) {
			System.out.println("invalid line numbers");
			return;
		}

		FileSplitter fileSplitter = new FileSplitter();
		fileSplitter.fileSplitting (filePath, lineNumbers);

		}

		public void fileSplitting (String filePath, int lineNumbers){

		File inputFile = new File(filePath);
		try(Scanner input = new Scanner(inputFile)){


			int fileCount = 1;
			while(input.hasNextLine()){

				String FileSplitName = nextFileName(inputFile, fileCount);
				File output = new File (inputFile.getParentFile(), FileSplitName);

				PrintWriter writer = new PrintWriter(output);

				int lineSequence = 0;
				while( lineSequence < lineNumbers){

					if(input.hasNextLine()){
						 writer.println(input.nextLine());
					}else{
						break;
					}

					lineSequence++;
				}

				fileCount++;
				writer.flush();
				writer.close();
			}



		}catch(FileNotFoundException ex){
			System.out.println(ex.getMessage());
		}

		}

		public String nextFileName(File inputFile, int counter){

		String nameOfFile = inputFile.getName();
		String FileExtension = nameOfFile.substring(nameOfFile.lastIndexOf('.'));
		String FileNameNoExtension = nameOfFile.substring(0, nameOfFile.lastIndexOf('.') );

		return FileNameNoExtension + "-" + counter + FileExtension;

		}

		public File getFileObject(String filePath) {
		File file = new File(filePath);
			try {
				if(!file.exists()){
					throw new FileNotFoundException();
				}

				if(!file.isFile()){
					throw new IOException();
				}

			} catch(FileNotFoundException ex){
				System.out.println(filePath + " File not Found");

			}catch(IOException ex){
				System.out.println(ex.getMessage());
			}

			return file;
		}

	}

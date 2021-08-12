package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" What is the search word?");
        String searchWord = scanner.nextLine();

        System.out.println("What is the replacement word?");
        String replacementWord = scanner.nextLine();

        System.out.println("What is the source file?");
        String sourceFile = scanner.nextLine();

        System.out.println("What is the destination file?");
        String destinationFile = scanner.nextLine();

        FindAndReplace findAndReplace = new FindAndReplace();
        findAndReplace.wordFindNReplace(searchWord, replacementWord, sourceFile, destinationFile);


    }

    public void wordFindNReplace(String searchWord, String replacementWord, String sourceFile, String destinationFile){
        File inputFile = new File(sourceFile);
        File outputFile = new File(destinationFile);

        if(!(inputFile.exists())){
            System.out.println(sourceFile + ":File does not exist");
            return;
        }

        try(Scanner inputScanner = new Scanner(inputFile)){
            PrintWriter writer = null;

            if(!(outputFile.exists())) {
                 writer = new PrintWriter(new FileOutputStream(outputFile, true));

            }else if((outputFile.exists())) {
                 writer = new PrintWriter(new FileOutputStream(outputFile, false));

            }

            while(inputScanner.hasNextLine()){
                String line = inputScanner.nextLine();


                    if(line.contains(searchWord)){
                        writer.println(line.replace(searchWord, replacementWord));

                    }else{

                        writer.println(line);
                    }
                }
            writer.flush();
            writer.close();

        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}

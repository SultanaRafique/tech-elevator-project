package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScratchPad {

    public static void main(String[] args) {
        String filePath = "rtn.txt";
        File myFile = new File(filePath);

        System.out.println(filePath + " exists: " + myFile.exists());
        System.out.println("Absolute path of " + filePath + ": " + myFile.getAbsolutePath());
//
//      Scanners using System.in should not be closed because the keyboard input cannot be reopendd.
//      best practice is to open one at beginning of profram and let it get cleaned up when the program
//      exits
//
//        Scanner input = new Scanner(System.in);

        if (myFile.exists()) {
            try (Scanner scanner = new Scanner(myFile)) {
                while(scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }

            } catch (FileNotFoundException ex) {
                System.out.println(filePath + " not found");
            }
        }




    }
}

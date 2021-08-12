package com.techelevator;

import java.util.Scanner;

public class ScratchPad {

    public static void main(String[] args) {
            ScratchPad pad = new ScratchPad();

//        System.out.println(pad.returnFromLoop(5));
//        System.out.println(pad.returnFromLoop(1000));
//        System.out.println(pad.sumForIterations(25));
//        System.out.println(pad.breakFromLoop(7));
//        System.out.println(pad.continueFromLoop(7));
        String[] data ={"hi", "bye", "so long", "happy Friday!"};
        pad.dumpArray(data);
        pad.dumpArray(new String[] {"one", "two"});

        pad.sayHi();

        pad.readAndCHeckForMatch("Yoav");
    }

    public void sayHi() {
        System.out.println("Hi");
    }

    public String returnFromLoop(int num) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i == num) {
                return "stopped";
            }
        }
        return "didn't stop";
    }

    public String breakFromLoop(int num) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i == num) {
                break;
            }
        }
        return "didn't stop";
    }

    public String continueFromLoop(int num) {
        for (int i = 0; i <= 10; i++) {
            if (i == num) {
                continue;
            }
            System.out.println(i);
        }
        return "didn't stop";
    }

    public int sumForIterations(int times) {
        int sum = 0;

        for(int i = 0; i < times; i++) {
            sum += 2;
        }

        return sum;
    }

    public void dumpArray(String[] theArray) {
        for(int i = 0; i < theArray.length; i++) {
            System.out.println(theArray[i]);
        }
    }


    public int addNums(int num1, int num2) {
        return 0;
    }
    public int addNums(int num1, int num2, int num3) {
        return 0;
    }

    public int addNums(int num1, long num2) {
        return 0;
    }
    public int addNums(long num1, int num2) {
        return 0;
    }


    public boolean readAndCHeckForMatch(String matchValue) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputValue = scanner.nextLine();

        // with strings we do
        // value1.equals(value2) RATHER thanj value1 == value2
        if (inputValue.equals(matchValue)) {
//        if (inputValue == matchValue) {
            System.out.println("Match!");
            return true;
        } else {
            System.out.println("No match");
            return false;
        }
    }





}

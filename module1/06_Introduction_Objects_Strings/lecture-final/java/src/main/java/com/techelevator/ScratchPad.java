package com.techelevator;

import java.net.PortUnreachableException;

public class ScratchPad {

    public static void main(String[] args) {
        ScratchPad pad = new ScratchPad();
        pad.arrayToString();
        pad.demcimalToBinary(294);
    }


    public void arrayToString() {
        char[] theArray = {'H', 'e', 'l', 'l', 'o'};

        String theString = theArray.toString();

        System.out.println(theString);
    }


    public void myMethod() {
        int num = 5;
        boolean isTrue = true;
        String myText = "hi";

        String otherText = new String("Hello");

        System.out.println(num);
    }

    // demcimalToBinary
    public void demcimalToBinary(int decimal) {
        String binary = "";

        while(decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder + "";
            decimal = decimal / 2;
        }

        System.out.println(binary);

        // walk through indexes of binary string backwards
        for (int i = binary.length() - 1; i >= 0; i--) {
            System.out.print(binary.charAt(i));
        }
    }

}
/*

isTrue
num
call to myMethod()
c
b
a


*/

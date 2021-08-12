package com.techelevator.dummy;

public class PackageClass {

    public void printName() {
        BaseClass dummy = new BaseClass("Hi");
        dummy.name = "Bye";
        System.out.println(dummy.getName());
    }
}

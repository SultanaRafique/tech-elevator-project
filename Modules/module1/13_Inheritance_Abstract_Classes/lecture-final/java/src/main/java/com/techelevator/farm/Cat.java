package com.techelevator.farm;

public final class Cat extends FarmAnimal {

    public Cat() {
        super("Cat", "meow!");
    }

    public void eat() {
        System.out.println("Eating mice....");
    }
    /*

    >>> can't do this because it is marked
        final in FarmAnimal <<<<

    @Override
    public String getSound() {
        return "moew!";
    }
    */
}

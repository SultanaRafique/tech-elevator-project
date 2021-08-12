package com.techelevator.Items;

public abstract class Item {

    public static final int DEFAULT_QUANTITY = 5;


    public abstract String getName();

    public abstract void setName(String name) ;

    public abstract int getPrice();

    public abstract void setPrice(int price);

    public abstract String getSlot();

    public abstract void setSlot(String slot);

    public abstract int getQuantity();

    public abstract void setQuantity(int quantity);

    public abstract String getCategory();

    public abstract void setCategory(String category);

    public abstract double displayPrice();

}

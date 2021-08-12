package com.techelevator.Items;

public class DrinkItem extends Item{
    public final int DEFAULT_QUANTITY = 5;
    private String slot;
    private String name;
    private int price;
    private String category;
    private int quantity ;
    DrinkItem(){}

    public DrinkItem(String slot, String name, int price, String category, int quantity) {
        this.slot = slot;
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override

    public double displayPrice() {
        return getPrice() / 100.0;
    }
}

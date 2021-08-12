package com.techelevator.Items;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Inventory {

    String path = "C:\\Users\\Student\\workspace\\blue-mod1-capstone-team4\\java\\vendingmachine.csv";
    File inventoryFile = new File(path);

    private Map<String, Item> items = new TreeMap<>();

    private Map<String, Item> inventoryMap = getItems();

    public Map<String, Item> getInventoryMap() {
        return inventoryMap;
    }

    public Map<String, Item> getItems() {

        try (Scanner inventoryScanner = new Scanner(inventoryFile)) {

            while (inventoryScanner.hasNextLine()) {
                String line = inventoryScanner.nextLine();

                String[] itemDetails = line.split("\\|");

                String category = itemDetails[3];

                switch (category) {

                    case "Chip":
                        ChipItem chipItem = new ChipItem(itemDetails[0],itemDetails[1],(int)((Double.parseDouble(itemDetails[2])*100)),itemDetails[3],Item.DEFAULT_QUANTITY);
                        items.put(itemDetails[0], chipItem);
                        break;

                    case "Candy":

                        CandyItem candyItem = new CandyItem(itemDetails[0],itemDetails[1],(int)((Double.parseDouble(itemDetails[2])*100)),itemDetails[3],Item.DEFAULT_QUANTITY);
                        items.put(itemDetails[0], candyItem);

//
                        break;

                    case "Drink":

                        DrinkItem drinkItem = new DrinkItem(itemDetails[0],itemDetails[1],(int)((Double.parseDouble(itemDetails[2])*100)),itemDetails[3],Item.DEFAULT_QUANTITY);
                        items.put(itemDetails[0], drinkItem);

                        break;

                    case "Gum":

                       GumItem gumItem = new GumItem(itemDetails[0],itemDetails[1],(int)((Double.parseDouble(itemDetails[2])*100)),itemDetails[3],Item.DEFAULT_QUANTITY);
                        items.put(itemDetails[0], gumItem);

                        break;

                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());

        }
        return items;

    }

    public void  purchaseDisplayItems(){
        List<String> itemList = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(inventoryFile)) {
            while(fileScanner.hasNextLine()){

                String line = fileScanner.nextLine();
//
                String[] lineArray = line.split("\\|");
                for(String s : lineArray){

                    System.out.format("%-20s" , s);
                }
                System.out.println();

            }
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void updateQuantity(String slot){

        Item item = items.get(slot);

        item.setQuantity(item.getQuantity() - 1);

    }


}

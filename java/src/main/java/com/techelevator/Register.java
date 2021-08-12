package com.techelevator;

import com.techelevator.Items.Inventory;
import com.techelevator.Items.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Register {

    File logFile = new File("log.txt");
    boolean append = logFile.exists() ? true : false;

    private int vendingMachineBalance;
    private int userBalance ;


    Scanner scanner = new Scanner(System.in);
    Inventory inventory = new Inventory();



    public int moneyFeed(String choice){


        if(choice.equals("$1")){
            updateUserBalance(100);

        }else if(choice.equals("$5")){
            updateUserBalance(500);

        }else if(choice.equals("$10")){
            updateUserBalance(1000);
        }
        String myString = String.format("Current Money Provided: $%.2f", displayUserBalance());
        System.out.println(myString);

        return userBalance;
    }

    public void selectProduct(){
        String myString = String.format("Current Money Provided: $%.2f", displayUserBalance());
        System.out.println(myString);
        System.out.print("Please enter slot number: ");
        String slot = scanner.nextLine();

        boolean containsItem = inventory.getInventoryMap().containsKey(slot);

        if(!(slot == null) && containsItem){

            makePurchase(slot);

            dispense(slot);

        }else{
            System.out.println("Please enter valid slot");

        }
    }

    public void makePurchase(String slot) {

        if(getUserBalance() <= 0){
            return;
        }
        int  quantity;
        if(getUserBalance() <= 0){
            System.out.println("Insufficient Balance");
            return;
        }

        if (!(slot == null) ) {
            boolean containsItem = inventory.getInventoryMap().containsKey(slot.toUpperCase());
            if  (!containsItem) {
                System.out.println("Item unavailable");
                return;

            } else if (slot  != null) {

                quantity = inventory.getInventoryMap().get(slot).getQuantity();
                if( quantity == 0){

                    System.out.println("SOLD OUT");
                    return;
                }
                else {
                    inventory.updateQuantity(slot);
                }
            }

        }else{
            System.out.println("Invalid input");
        }

    }

    public void dispense(String slot) {

        if(getUserBalance() <= 0){
            System.out.println("Insufficient Balance");
            return;
        }
        if(inventory.getInventoryMap().get(slot).getQuantity() == 0){

            return;
        }

        Item item = inventory.getInventoryMap().get(slot);
        setUserBalance(getUserBalance() - item.getPrice());
        double userRemainingBalance = (getUserBalance())/100.0;
        String myString = String.format("%s costs $ %.2f you have $%.2f",item.getName(), item.displayPrice(),userRemainingBalance);
        System.out.println(myString);


        if (item.getCategory().equals("Chip")) {
            System.out.println("Crunch Crunch, Yum!");

        } else if (item.getCategory().equals("Candy")) {

            System.out.println("Munch Munch, Yum!");

        } else if (item.getCategory().equals("Drink")) {

            System.out.println("Glug Glug, Yum!");

        } else if (item.getCategory().equals("Gum")) {

            System.out.println("Chew Chew, Yum!");
        }

        setVendingMachineBalance(item.getPrice());
        String nameNSlot = inventory.getInventoryMap().get(slot).getName() + " " + slot;
        printLog(nameNSlot);
    }

    public void finishTransaction(){

        String change =  returnChange(getUserBalance());
        System.out.println(change);
        setVendingMachineBalance(0);
        System.out.println("Transaction completed!!!");
    }

    public int getUserBalance() {
        return userBalance;
    }

    public double displayUserBalance(){

        return (getUserBalance() / 100.0);
    }

    public double displayVendingMachineBalance(){

        return (getVendingMachineBalance() / 100.0);
    }

    public void setUserBalance(int userBalance) {
        this.userBalance = userBalance;
    }


    public int updateUserBalance(int depositAmount){
        return userBalance += (depositAmount);
    }

    public double subtractMoney(double subtractAmount){
        if(vendingMachineBalance >= subtractAmount) {
            return this.vendingMachineBalance -= subtractAmount;
        }
        return vendingMachineBalance;
    }


    public int getVendingMachineBalance() {

        return vendingMachineBalance;
    }
    public void setVendingMachineBalance(int vendingMachineBalance) {

        this.vendingMachineBalance = vendingMachineBalance;
    }


    public String returnChange(double change) {

        double quarter = 25;
        double dime = 10;
        double nickel = 5;

        int quarterCount = 0;
        int dimeCount = 0;
        int nickelCount = 0;
        while (change > 0) {

            if (change >= quarter) {
                change -= 25;
                quarterCount++;

            } else if (change >= dime) {
                change -= 10;
                dimeCount++;

            } else if (change >= nickel) {
                change -= 25;
                nickelCount++;

            }

        }
        String result =  "your change is " + quarterCount + " Quarter(s) " + dimeCount + " Dime(S) " + nickelCount + " Nickel(s).";
        printLog("GIVE CHANGE");
        return result;
    }


    public void printLog (String log){
        try(PrintWriter writer = new PrintWriter(new FileOutputStream(logFile, append)) ){

            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
            writer.println(formatter.format(dateTime) + " "+  log +": $" +displayUserBalance() + " $" +displayVendingMachineBalance());;

        }catch(FileNotFoundException ex){
            System.out.println("Could not write to log" + ex.getMessage());
        }

    }


}






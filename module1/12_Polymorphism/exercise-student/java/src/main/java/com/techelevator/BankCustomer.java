package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public BankCustomer(){

    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Accountable[] getAccounts() {
        return accounts.toArray(new Accountable[0]);
    }

    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isVip(){
        boolean vipCustomer = false;
        int totalBalance = 0;

        for(Accountable account : accounts){
            totalBalance += account.getBalance() ;
        }
        if(totalBalance >= 25000){
            vipCustomer = true;
        }
        return vipCustomer;

    }
    
}

package com.techelevator;

public class CreditCardAccount implements Accountable{

    public static final int DEFAULT_DEBT = 0;
    String accountHolder;
    String accountNumber;
    int debt;


    public CreditCardAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        debt = DEFAULT_DEBT;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }

    public int pay(int amountToPay){
        return debt -=  amountToPay;
    }

    public int charge(int amountToCharge){
        return debt += amountToCharge;
    }

    @Override
    public int getBalance() {
        return - debt;
    }
}

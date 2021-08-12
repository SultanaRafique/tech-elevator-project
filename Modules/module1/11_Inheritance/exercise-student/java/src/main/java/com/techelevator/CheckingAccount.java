package com.techelevator;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String accountHolderName,
                           String accountNumber){
        super(accountHolderName,accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw){
        int amountAfterWithraw = getBalance() - amountToWithdraw ;

        if(amountAfterWithraw > -100 ) {
            if (amountAfterWithraw <= 0) {
                amountToWithdraw += 10;
            }
            return super.withdraw(amountToWithdraw);
        }
        return getBalance();
    }

}

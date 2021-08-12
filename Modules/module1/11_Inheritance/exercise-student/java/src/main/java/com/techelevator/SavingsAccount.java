package com.techelevator;

public class SavingsAccount extends BankAccount{


    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {

        int balanceAfterWithdraw = getBalance() - amountToWithdraw;
        if (balanceAfterWithdraw >= 0) {

            if (balanceAfterWithdraw < 150) {
                    amountToWithdraw += 2;
                }
                return super.withdraw(amountToWithdraw);
            }
        return getBalance();
    }
}

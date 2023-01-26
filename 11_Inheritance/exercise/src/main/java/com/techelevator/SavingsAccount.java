package com.techelevator;

public class SavingsAccount extends BankAccount {
    final int SERVCHARGE = 2;
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
    public int withdraw(int amountToWithdraw) {

        if ((super.getBalance() - amountToWithdraw) - SERVCHARGE < 0){

            return super.getBalance();
        }
        if (super.getBalance() - amountToWithdraw >= 150) {
            return super.withdraw(amountToWithdraw);
        }

        if  (super.getBalance() - amountToWithdraw <= 150){
            super.withdraw(amountToWithdraw + SERVCHARGE);
            return super.getBalance();
        }
        else{
            return super.getBalance();
        }
    }

}

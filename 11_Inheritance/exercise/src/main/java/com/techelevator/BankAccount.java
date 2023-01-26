package com.techelevator;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
public class BankAccount {
    private String accountNumber;
    private int balance = 0;
    private String accountHolderName;



    public BankAccount(String accountHolderName, String accountNumber) {
        balance = 0;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
   }
//Getters and setters
    public BankAccount(String accountHolderName,String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }



    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber() {

        this.accountNumber = accountNumber;
    }



    public String getAccountHolderName() {
        return accountHolderName;

    }

   public String setAccountHolderName(){
        this.accountHolderName = accountHolderName;
        return accountHolderName;
}

    public int getBalance(){
        this.balance = balance;

        return balance;
    }

    private void setBalance(){
        this.balance = balance;
    }

    //Methods
    public int deposit(int amountToDeposit){
        balance = balance + amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        return balance;
    }


}

package com.techelevator;

public class CheckingAccount extends BankAccount {

    final int OVERDRAFT_FEE = 10;
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);

    }
   // public int getBalance(){
      //  return super.getBalance();
  //  }

   // public int deposit(int amountToDeposit){

        //return super.getBalance() + amountToDeposit;
   // }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (super.getBalance() >= amountToWithdraw) {
            return super.withdraw(amountToWithdraw);
        }
        else {

            if (super.getBalance() - amountToWithdraw > -100){
                super.withdraw(amountToWithdraw + OVERDRAFT_FEE);
                return super.getBalance();
            }
            else {
                return super.getBalance();
            }
        }
        //return super.getBalance();
    }
}

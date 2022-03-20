package com.techelevator;

public class SavingsAccount extends BankAccount{
    private int withdraw;

    public int withdraw(int  withdraw) {
        int overDraftFee = 2;
        if(this.getBalance() - withdraw < 0){
            return this.getBalance();
        }
         if(this.getBalance() - withdraw < 150){
             super.withdraw(withdraw + overDraftFee);
             return this.getBalance();
         }

         super.withdraw(withdraw);
         return getBalance();
    }



    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public int getWithdraw() {
        return withdraw;
    }
}

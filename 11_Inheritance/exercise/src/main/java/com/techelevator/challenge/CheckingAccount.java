package com.techelevator.challenge;

public class CheckingAccount extends BankAccount {
    private int withdraw;


    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int withdraw) {
       int overDraftFee = 10;
        if(this.getBalance() - withdraw <= -100){
            //super.withdraw(overDraftFee+ withdraw);
            return this.getBalance();
        }

        if(this.getBalance() - withdraw < 0) {
            super.withdraw(overDraftFee + withdraw);
            return this.getBalance();
        }
        super.withdraw(withdraw);

        return getBalance();
    }


    public int getWithdraw() {
        return withdraw;
    }
}

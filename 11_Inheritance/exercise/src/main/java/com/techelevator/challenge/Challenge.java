package com.techelevator.challenge;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(" Bank Teller Application");
        BankAccount checkingAccount = new CheckingAccount("Bernice", "CHK:1234");
        BankAccount savingsAccount = new SavingsAccount("Bernice", "SAV:9876");

        int amountToDeposit = 2;
        int newBalance = checkingAccount.deposit(amountToDeposit);














    }
}

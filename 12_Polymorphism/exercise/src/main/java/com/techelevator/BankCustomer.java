package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable{
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    //<editor-fold desc="Constructor and Getters/Setters">
    public BankCustomer(String name, String address, String phoneNumber, List<Accountable> accounts) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
 // Step Five: accounts	List<Accountable>	X*		The customer's list of Accountable s.
    public Accountable[] getAccounts() {
        return accounts.toArray(new Accountable[accounts.size()]);
    }
    //</editor-fold>

    public BankCustomer() {
    }
//    public Accountable[] getAccounts(){
//
//    }
//

    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }

    @Override
    public int getBalance() {
        return 0;
    }

    //Step Six: Add the isVip() method to the BankCustomer class
    public boolean isVip() {
        int total = 0;
        for (Accountable account : accounts) {
             total =  total + account.getBalance();
        }
        if (total >= 25000){
            return true;
        }else{
            return false;
            }
    }


}

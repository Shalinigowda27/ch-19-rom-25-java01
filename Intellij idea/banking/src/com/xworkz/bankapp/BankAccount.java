package com.xworkz.bankapp;

//Inheritance Method;/ isa relationship
//parent/super/base
public class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void debit(double amount){
         balance = balance - amount;
    }

    public void credit(double amount){
        balance = balance + amount;
    }
    public void transfer(BankAccount anotherAccount, double amount){

        this.debit((amount));
        anotherAccount.credit(amount);
    }
}

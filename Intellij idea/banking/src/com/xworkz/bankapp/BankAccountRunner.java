package com.xworkz.bankapp;

public class BankAccountRunner {
    public static void main(String[] args) {

        BankAccount shaliniAccount = new BankAccount();
        shaliniAccount.credit(10000.00);

        BankAccount friendAccount = new BankAccount();
        shaliniAccount.transfer(friendAccount, 1000.00);

        System.out.printf("The available balance in shalini account is "+shaliniAccount.getBalance());

        System.out.printf("The available balance in friend account is "+friendAccount.getBalance());

        BankAccount momAccount = new BankAccount();

        //SavingAccount savingAccount = new SavingAccount();
        //BankAccount momAccount = new SavingAccount(); it is called polymorphism

        momAccount.transfer(shaliniAccount, 5000.00);

        System.out.printf("The available balance in shalini account is "+shaliniAccount.getBalance());
    }
}

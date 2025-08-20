package com.xworkz.instrumentapp;

public class Instrument {

    private double cost;

    public double getCost() {
        return cost;
    }

    public  void credit(double amount){
        cost = cost + amount;
    }
    public  void  debit(double amount){
        cost = cost - amount;
    }

    public void transfer(Instrument anotherInstrument, double amount){
        this.debit(amount);
        anotherInstrument.credit(amount);
    }
}
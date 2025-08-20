package com.xworkz.chocolateapp.chocolate;

public class Chocolate {

    private double cost;

    public double getCost() {
        return cost;
    }

public void  credit(double amount){

        cost = cost + amount;
}
public void debit(double amount){

        cost = cost - amount;
}

public void transfer(Chocolate anotherChocolate, double amount){
    this.debit(amount);
    anotherChocolate.credit(amount);
}
}
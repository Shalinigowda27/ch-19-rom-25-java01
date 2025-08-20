package com.xworkz.clothingapp.cloth;

public class Cloth {

    private  double price;

    public double getPrice() {
        return price;
    }

    public void credit(double amount){
        price = price + amount;
    }

    public  void  debit(double amount){
        price = price - amount;
    }

    public void transfer(Cloth anotherCloth, double amount){
        this.debit(amount);
        anotherCloth.credit(amount);
    }
}

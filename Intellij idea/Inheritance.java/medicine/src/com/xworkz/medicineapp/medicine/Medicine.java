package com.xworkz.medicineapp.medicine;

public class Medicine {

    private double price;

    public double getPrice() {
        return price;
    }

    public void  credit(double amount){
        price = price + amount;
    }
    public void debit(double amount){
        price = price - amount;
    }

    public void transfer(Medicine anotherMedicine, double amount){
        this.debit(amount);
        anotherMedicine.credit(amount);
    }
}

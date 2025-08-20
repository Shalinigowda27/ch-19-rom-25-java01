package com.xworkz.chocolateapp.chocolate;

public class ChocolateRunner {

    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate();
        chocolate.credit(1000.00);

        Chocolate momChocolate = new Chocolate();
        chocolate.transfer(momChocolate, 100.00);

        System.out.printf("The chocolate cost is "+chocolate.getCost());
        System.out.printf("The mom chocolate cost is  "+momChocolate.getCost());
    }
}
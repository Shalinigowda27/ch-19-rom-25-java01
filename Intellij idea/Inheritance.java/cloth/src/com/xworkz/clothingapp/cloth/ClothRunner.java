package com.xworkz.clothingapp.cloth;

public class ClothRunner {
    public static void main(String[] args) {

        Cloth cloth = new Cloth();
        cloth.credit(2000.00);

        Cloth brotherCloth = new Cloth();
        cloth.transfer(brotherCloth, 500.00);

        System.out.printf("The cloth price is "+cloth.getPrice());
        System.out.printf("The brother cloth price is  "+brotherCloth.getPrice());
    }
}

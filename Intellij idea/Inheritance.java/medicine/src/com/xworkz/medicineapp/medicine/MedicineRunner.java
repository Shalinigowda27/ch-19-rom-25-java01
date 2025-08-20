package com.xworkz.medicineapp.medicine;

public class MedicineRunner {
    public static void main(String[] args) {

        Medicine tablet = new Medicine();
        tablet.credit(1000.00);

        Medicine friendTablet = new Medicine();
        tablet.transfer(friendTablet, 100.00);

        System.out.printf("The tablet price is "+tablet.getPrice());
        System.out.printf("The friend tablet price is  "+friendTablet.getPrice());
    }
    }
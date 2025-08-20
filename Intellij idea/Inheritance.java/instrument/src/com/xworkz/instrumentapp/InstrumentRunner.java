package com.xworkz.instrumentapp;

public class InstrumentRunner {
    public static void main(String[] args) {

        Instrument sitar = new Instrument();
        sitar.credit(15000.00);

        Instrument friendSitar = new Instrument();
        sitar.transfer(friendSitar, 5000.00);

        System.out.printf("The sitar cost is "+sitar.getCost());
        System.out.printf("The friend sitar is  "+friendSitar.getCost());
    }
}
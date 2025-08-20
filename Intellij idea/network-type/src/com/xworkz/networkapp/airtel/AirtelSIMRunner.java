package com.xworkz.networkapp.airtel;

public class AirtelSIMRunner {

        public static void main(String []args){

            System.out.println("main started");

            AirtelSIM airtelSIM = new AirtelSIM();
            airtelSIM.airtelId = 5;
            airtelSIM.airtelRange = "49.32.0.0 – 49.63.255.255";
            System.out.println("the id is "+ airtelSIM.airtelId);
            System.out.println("The range is  "+ airtelSIM.airtelRange);
        }
}
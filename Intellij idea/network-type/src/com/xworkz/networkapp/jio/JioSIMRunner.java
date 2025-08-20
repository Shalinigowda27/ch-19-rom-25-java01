package com.xworkz.networkapp.jio;

public class JioSIMRunner {

    public static void main(String[] args){

        System.out.println("Main started");

        JioSIM jioSIM = new JioSIM();
        jioSIM.setJioRange("450m");
        jioSIM.setJioId(3);
        System.out.println("The range is  "+ jioSIM.getJioRange());
        System.out.println("the id is "+ jioSIM.getJioId());
    }
}
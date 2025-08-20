package com.xworkz.passportapp.seva;

import com.xworkz.passportapp.user.PassportUser;

public class PassportRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        PassportUser passportUser = new PassportUser();
        passportUser.setCpvLocation("PO");
        passportUser.setDcdrLocation("Bengaluru");
        passportUser.setGivenName("Shalini");
        passportUser.setSurName("Gowda");
        passportUser.setDob("27/03/2003");
        passportUser.setEmail("shalinigowda1727@gmail.com");
        passportUser.setPassword("shalu1727");

        PassportSeva obj = new PassportSeva();
        obj.createPassportUser(passportUser);

        System.out.println("The CPV Location is  "+ passportUser.getCpvLocation());
        System.out.println("The DCDR Location is  "+ passportUser.getDcdrLocation());
        System.out.println("The Given Name is  "+ passportUser.getGivenName());
        System.out.println("The SurName is " + passportUser.getSurName());
        System.out.println("The Date of Birth is  "+ passportUser.getDob());
        System.out.println("The Email of user is "+ passportUser.getEmail());
        System.out.println("The Password is "+ passportUser.getPassword());

    }
}


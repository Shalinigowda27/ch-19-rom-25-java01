package com.xworkz.amazonapp.login;

import com.xworkz.amazonapp.user.AmazonUser;

public class AmazonLogin {

    AmazonUser amazonUser;

    public boolean createGoogleUser(AmazonUser amazonUser) {
        boolean amazonUserCreated = false;
        boolean firstnameValid = false;
        boolean lastnameValid = false;
        boolean addressValid =false;
        boolean pincodeValid = false;
        boolean emailValid = false;
        boolean passwordValid = false;


        if (amazonUser.getFirstName() != null) {
            firstnameValid = true;
        } else {
            System.out.println("The first name is not valid");
        }

        if(amazonUser.getLastName() != null){
            lastnameValid = true;
        }
        else{
            System.out.println("The last name is not valid");
        }

        if(amazonUser.getAddress() != null){
            addressValid = true;
        }
        else{
            System.out.println("The address is not valid");
        }

        if(amazonUser.getPincode() != 0){
            pincodeValid = true;
        }
        else{
            System.out.println("The pincode is not valid ");
        }

        if(amazonUser.getEmail() != null){
            emailValid = true;
        }
        else {
            System.out.println("The email is  not valid");
        }

        if(amazonUser.getPassword() != null){
            passwordValid = true;
        }
        else {
            System.out.println("The password is not valid ");
        }

        if(firstnameValid && lastnameValid && addressValid && pincodeValid && emailValid && passwordValid){
            amazonUserCreated = true;
            this.amazonUser = amazonUser;
        }

    }

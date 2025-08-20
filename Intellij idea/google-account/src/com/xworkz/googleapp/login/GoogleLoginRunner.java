package com.xworkz.googleapp.login;

import com.xworkz.googleapp.user.GoogleUser;

public class GoogleLoginRunner {

    public static void main(String[] args) {

        GoogleUser googleUser = new GoogleUser();
        googleUser.setName("Shalini");
        googleUser.setEmail("Shalini@gmail.com");
        googleUser.setPassword("shalini1727");
        googleUser.setConfirmPassword("shalini1727");
        googleUser.setPhoneNo(9876543218L);

        GoogleLogin obj = new GoogleLogin();
        obj.createGoogleUser(googleUser);
        if(obj.createGoogleUser(googleUser)){
            obj.getInfo();
        }else{
            System.out.println("Not registered");
        }
        /*System.out.println("The name is  "+ googleUser.getName());
        System.out.println("The email is "+ googleUser.getEmail());
        System.out.println("The password is "+googleUser.getPassword());
        System.out.println("The confirm password is "+googleUser.getConfirmPassword());
        System.out.println("The phone number is "+googleUser.getPhoneNo());*/

    }
}
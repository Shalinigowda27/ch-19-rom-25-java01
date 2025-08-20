package com.xworkz.googleapp.login;

import com.xworkz.googleapp.user.GoogleUser;

public class GoogleLogin {

    GoogleUser googleUser;

    public boolean createGoogleUser(GoogleUser googleUser) {
        boolean googleUserCreated = false;
        boolean nameValid = false;
        boolean emailValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;
        boolean phoneNoValid = false;

        if (googleUser.getName() != null) {
            nameValid = true;
        } else {
            System.out.println("The given name is not valid");
        }

        if (googleUser.getEmail() != null) {
            emailValid = true;
        } else {
            System.out.println("The email is not valid");
        }

        if (googleUser.getPassword() != null) {
            passwordValid = true;
        } else {
            System.out.println("the password is not valid");
        }

        if (googleUser.getConfirmPassword() != null&&googleUser.getConfirmPassword().equals(googleUser.getPassword())) {
            confirmPasswordValid = true;
        } else {
            System.out.println("The confirm Password is not valid");
        }

        if (googleUser.getPhoneNo() != 0) {
            phoneNoValid = true;
        } else {
            System.out.println("The phone number is not valid");
        }

        if (nameValid && emailValid && passwordValid == confirmPasswordValid && phoneNoValid ) {
            googleUserCreated = true;
            this.googleUser = googleUser;
        }
    return googleUserCreated;

        }
        public  void  getInfo(){
            System.out.println("The name is  "+ googleUser.getName());
            System.out.println("The email is "+ googleUser.getEmail());
            System.out.println("The password is "+googleUser.getPassword());
            //System.out.println("The confirm passworrd is "+googleUser.getConfirmPassword());
            System.out.println("The phone number is "+googleUser.getPhoneNo());
        }


}

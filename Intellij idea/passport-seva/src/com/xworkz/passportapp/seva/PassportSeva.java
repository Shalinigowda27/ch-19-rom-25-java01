package com.xworkz.passportapp.seva;

import com.xworkz.passportapp.user.PassportUser;

public class PassportSeva {

    PassportUser passportUser;

    public boolean createPassportUser(PassportUser passportUser) {
        boolean passportUserCreated = false;
        boolean cpvLocationValid = false;
        boolean dcdrLocationValid = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean emailValid = false;
        boolean passwordValid = false;

        if (passportUser.getCpvLocation() != null) {
            cpvLocationValid = true;
        } else {
            System.out.println("CPV Location is not valid");
        }

        if (passportUser.getDcdrLocation() != null) {
            dcdrLocationValid = true;
        } else {
            System.out.println("Dcdr location is not valid");
        }

        if (passportUser.getGivenName() != null) {
            givenNameValid = true;
        } else {
            System.out.println("The given name is not valid");
        }

        if (passportUser.getSurName() != null) {
            surNameValid = true;
        } else {
            System.out.println("The sur name is not valid");
        }

        if (passportUser.getEmail() != null) {
            emailValid = true;
        } else {
            System.out.println("The email is not valid");
        }

        if (passportUser.getPassword() != null) {
            passwordValid = true;
        } else {
            System.out.println("The password is not valid");
        }

        if (cpvLocationValid && dcdrLocationValid && givenNameValid && surNameValid && emailValid && passwordValid) {
            passportUserCreated = true;
            this.passportUser = passportUser;
        }
        return  passportUserCreated;
    }
}
package com.xworkz.playstoreapp.validation;

import com.xworkz.playstoreapp.install.InstallApplication;

public class AppValidation {

    public boolean validateInstallApplication(InstallApplication installApplication) {
       boolean isInstallApplicationValidated = false;

       boolean isFirstNameValid = false;
       boolean isMiddleNameValid = false;
       boolean isLastNameValid = false;
       boolean isGenderValid = false;
       boolean isDobValid = false;
       boolean isAgeValid = false;
       boolean isPhoneNoValid = false;
       boolean isAddressValid = false;
       boolean isPermanentAddressValid = false;
       boolean isCityValid = false;
       boolean isStateValid = false;
       boolean isPinCodeValid = false;
       boolean isEmailIdValid = false;
       boolean isAppNameValid = false;
       boolean isNoOfAppsValid = false;

       if (installApplication.getFirstname() != null) {
          isFirstNameValid = true;
       } else {
          System.out.println("The first name is not valid");
       }

       if (installApplication.getMiddleName() != null) {
          isMiddleNameValid = true;
       } else {
          System.out.println("The middle name is not valid");
       }

       if (installApplication.getLastName() != null) {
          isLastNameValid = true;
       } else {
          System.out.println("The last name is not valid");
       }

       if (installApplication.getGender() != null) {
          isGenderValid = true;
       } else {
          System.out.println("The gender is not valid");
       }

       if (installApplication.getDob() != null) {
          isDobValid = true;
       } else {
          System.out.println("The date of birth is not valid");
       }
       if (installApplication.getAge() != 0) {
          isAgeValid = true;
       } else {
          System.out.println("The age is not valid");
       }

       if (installApplication.getPhoneNo() != 0) {
          isPhoneNoValid = true;
       } else {
          System.out.println("The phone number is not valid");
       }

       if (installApplication.getAddress() != null) {
          isAddressValid = true;
       } else {
          System.out.println("The address is not valid");
       }

       if (installApplication.getPermanentAddress() != null) {
          isPermanentAddressValid = true;
       } else {
          System.out.println("The permanent address is not valid ");
       }

       if (installApplication.getCity() != null) {
          isCityValid = true;
       } else {
          System.out.println("The city is not valid");
       }

       if (installApplication.getState() != null) {
          isStateValid = true;
       } else {
          System.out.println("The state is not valid");
       }

       if (installApplication.getPinCode() != 0) {
          isPinCodeValid = true;
       } else {
          System.out.println("The pinCode is not valid");
       }

       if (installApplication.getEmailId() != null) {
          isEmailIdValid = true;
       } else {
          System.out.println("The email id is not valid");
       }

       if (installApplication.getAppName() != null) {
          isAppNameValid = true;
       } else {
          System.out.println("The app name is not valid");
       }

       if (installApplication.getNoOfApps() != 0) {
          isNoOfAppsValid = true;
       } else {
          System.out.println("The number of apps are not valid");
       }

       if(isFirstNameValid && isMiddleNameValid && isLastNameValid && isGenderValid && isDobValid && isAgeValid && isPhoneNoValid && isAddressValid && isPermanentAddressValid && isCityValid && isStateValid && isPinCodeValid && isEmailIdValid && isAppNameValid && isNoOfAppsValid){
          isInstallApplicationValidated = true;
       }
       return isInstallApplicationValidated;
    }
}

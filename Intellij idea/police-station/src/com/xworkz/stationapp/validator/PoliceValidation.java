package com.xworkz.stationapp.validator;

import com.xworkz.stationapp.policeapp.PoliceApp;

public class PoliceValidation {

    public boolean validatePoliceApp(PoliceApp policeApp){
        boolean isPoliceAppValidated = false;

        boolean isStationNameValid = false;
        boolean isAddressValid = false;
        boolean isStationCodeValid = false;
        boolean isStateValid = false;
        boolean isPinCodeValid = false;
        boolean isPhoneNumberValid = false;
        boolean isEmailValid = false;

        if(policeApp.getStationName() != null){
            isStationNameValid = true;
        }else{
            System.out.println("The station name is not valid ");
        }

        if(policeApp.getAddress() != null){
            isAddressValid = true;
        }else{
            System.out.println("The address is not valid");
        }

        if(policeApp.getStationCode() != 0){
            isStationCodeValid = true;
        }else{
            System.out.println("The station code is not valid");
        }

        if(policeApp.getState() != null){
            isStateValid = true;
        }else{
            System.out.println("The state is not valid");
        }

        if(policeApp.getPinCode() != 0){
            isPinCodeValid = true;
        }else{
            System.out.println("The pin code is not valid");
        }

        if(policeApp.getPhoneNumber() != 0){
            isPhoneNumberValid = true;
        }else{
            System.out.println("The phone number is not valid");
        }

        if(policeApp.getEmail() != null){
            isEmailValid = true;
        }else {
            System.out.println("The email is not valid");
        }

        if(isStationNameValid && isAddressValid && isStationCodeValid && isStateValid && isPinCodeValid && isPhoneNumberValid && isEmailValid ) {
            isPoliceAppValidated = true;
        }

            return isPoliceAppValidated;

    }
}

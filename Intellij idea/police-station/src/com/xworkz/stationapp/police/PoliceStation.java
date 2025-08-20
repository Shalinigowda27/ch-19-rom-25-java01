package com.xworkz.stationapp.police;

import com.xworkz.stationapp.policeapp.PoliceApp;
import com.xworkz.stationapp.validator.PoliceValidation;

public class PoliceStation {

    PoliceApp policeApp;

    public boolean createPoliceApp(PoliceApp policeApp){
        boolean policeAppCreated = false;

        PoliceValidation policeValidation = new PoliceValidation();
        boolean isPoliceValidated = policeValidation.validatePoliceApp(policeApp);

        if(isPoliceValidated){
            this.policeApp = policeApp;
            policeAppCreated = true;
        }
        return policeAppCreated;
    }
    public  void  getPoliceInfo(){
        System.out.println("The station name is "+policeApp.getStationName());
        System.out.println("The address is "+policeApp.getAddress());
        System.out.println("The station code is "+policeApp.getStationCode());
        System.out.println("The state is "+policeApp.getStationCode());
        System.out.println("The state is "+policeApp.getState());
        System.out.println("The pinCode is "+policeApp.getPinCode());
        System.out.println("The phone number is "+policeApp.getPhoneNumber());
        System.out.println("The email is "+policeApp.getEmail());
    }
}

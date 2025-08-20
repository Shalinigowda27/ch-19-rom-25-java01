package com.xworkz.stationapp.validator;

import com.xworkz.stationapp.police.PoliceStation;
import com.xworkz.stationapp.policeapp.PoliceApp;

public class PoliceStationRunner {
    public static void main(String[] args) {
        PoliceApp policeApp =  new PoliceApp();
        policeApp.setStationName("Madnayakanahalli police station");
        policeApp.setAddress("Madnayakanahalli");
        policeApp.setStationCode(01);
        policeApp.setState("Karnataka");
        policeApp.setPinCode(562123);
        policeApp.setPhoneNumber(9874563258L);
        policeApp.setEmail("xyz@gmail.com");

        PoliceStation policeStation = new PoliceStation();
        boolean createPoliceApp = policeStation.createPoliceApp(policeApp);

        if(createPoliceApp){
            policeStation.getPoliceInfo();
        }
    }
}

package com.xworkz.playstoreapp.validation;

import com.xworkz.playstoreapp.install.InstallApplication;
import com.xworkz.playstoreapp.playstore.PlayStore;

public class PlayStoreRunner {

    public static void main(String[] args) {

        InstallApplication installApplication = new InstallApplication();
        installApplication.setFirstname("Shalini");
        installApplication.setMiddleName("Gowda");
        installApplication.setLastName("P");
        installApplication.setGender("Female");
        installApplication.setDob("27/03/2003");
        installApplication.setAge(23);
        installApplication.setPhoneNo(7204830958L);
        installApplication.setAddress("Bengaluru");
        installApplication.setPermanentAddress("Bangalore");
        installApplication.setCity("Bangalore");
        installApplication.setState("Karnataka");
        installApplication.setPinCode(562123);
        installApplication.setEmailId("shalini@gmail.com");
        installApplication.setAppName("Instagram");
        installApplication.setNoOfApps(10);


        PlayStore playStore = new PlayStore();
        boolean createInstallApplication = playStore.createInstallApplication(installApplication);

        if (createInstallApplication) {
            playStore.getAppInfo();
        }

    }
}

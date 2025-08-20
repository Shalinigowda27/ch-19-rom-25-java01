package com.xworkz.playstoreapp.playstore;

import com.xworkz.playstoreapp.install.InstallApplication;
import com.xworkz.playstoreapp.validation.AppValidation;

public class PlayStore {

    InstallApplication installApplication;

    public boolean createInstallApplication(InstallApplication installApplication){
        boolean isinstallApplicationCreated  = false;

        AppValidation appValidation = new AppValidation();
        boolean isInstallApplicationValidated = appValidation.validateInstallApplication(installApplication);
        if(isInstallApplicationValidated){
            this.installApplication = installApplication;
            isinstallApplicationCreated = true;
        }
        return isinstallApplicationCreated;
    }
        public  void getAppInfo(){
        System.out.println("The first name is "+installApplication.getFirstname());
        System.out.println("The middle name is "+installApplication.getMiddleName());
        System.out.println("The last name is "+installApplication.getLastName());
        System.out.println ("The gender is "+installApplication.getGender());
        System.out.println("The DOB is "+installApplication.getDob());
        System.out.println("The age is "+installApplication.getAge());
        System.out.println ("The phoneNo is "+installApplication.getPhoneNo());
        System.out.println ("The address is "+installApplication.getAddress());
        System.out.println("The permanent address is "+installApplication.getPermanentAddress());
        System.out.println ("The city is "+installApplication.getCity());
        System.out.println("The state is "+installApplication.getState());
        System.out.println("The pincode is "+installApplication.getPinCode());
        System.out.println ("The emailId is "+installApplication.getEmailId());
        System.out.println("The app name is "+installApplication.getAppName());
        System.out.println("The noOfApps are "+installApplication.getNoOfApps());

        }
}

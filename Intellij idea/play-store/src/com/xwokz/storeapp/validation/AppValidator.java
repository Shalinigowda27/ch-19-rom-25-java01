package com.xwokz.storeapp.validation;

import com.xwokz.storeapp.app.Application;

public class AppValidator {

    public boolean validateApplication(Application application) {
        boolean isApplicationValidated = false;

        boolean isApplicationNameValid = false;
        boolean isUpdatedOnValid = false;
        boolean isVersionValid = false;
        boolean isDownloadsValid = false;
        boolean isOfferedBy = false;
        boolean isReleasedOn = false;

        if (application.getApplicationName() != null) {
            isApplicationNameValid = true;
        } else {
            System.out.println("The application name is not valid ");
        }

        if(application.getUpdatedOn() !=null){
            isUpdatedOnValid = true;
        } else{
            System.out.println("The updated on is not valid");
        }

        if(application.getVersion() !=null){
            isVersionValid = true;
        } else{
            System.out.println("The version is not valid");
        }

        if(application.getDownloads() > 0){
           isDownloadsValid = true;
        } else{
            System.out.println("The downloads is not valid");
        }

        if(application.getOfferedBy() !=null){
            isOfferedBy = true;
        } else{
            System.out.println("The offered by is not valid");
        }

        if(application.getReleasedOn() !=null){
            isReleasedOn = true;
        } else{
            System.out.println("The released on is not valid");
        }

        if(isApplicationNameValid && isUpdatedOnValid && isVersionValid && isDownloadsValid && isOfferedBy && isReleasedOn){
            isApplicationValidated = true;
        }

    return isApplicationValidated;
    }
}

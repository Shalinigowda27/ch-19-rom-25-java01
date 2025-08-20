package com.xwokz.storeapp.playstore;

import com.xwokz.storeapp.app.Application;
import com.xwokz.storeapp.validation.AppValidator;

public class PlayStore {

    Application application;

    public boolean createApplication(Application application) {
        boolean ApplicationCreated = false;

        AppValidator appValidator = new AppValidator();

        boolean isApplicationValidated = appValidator.validateApplication(application);
        //.validateApplication is instance variable

        if (isApplicationValidated) {
            this.application = application;
            ApplicationCreated = true;
        }
        return ApplicationCreated;
    }
   public void getAppInfo(){
        System.out.println("Main Started");
        System.out.println("The application name is "+ application.getApplicationName());
        System.out.println("The updated on "+application.getUpdatedOn());
        System.out.println("The version is "+application.getVersion());
    }

}


package com.xwokz.storeapp.validation;

import com.xwokz.storeapp.app.Application;
import com.xwokz.storeapp.playstore.PlayStore;

public class PlayStoreRunner {

    public static void main(String[] args){

        Application application = new Application();
        application.setApplicationName("Instagram");
        application.setUpdatedOn("Aug 12,2025");
        application.setVersion("Varies with device");
        application.setDownloads(500000000L);
        application.setOfferedBy("Instagram");
        application.setReleasedOn("Apr 3,2012");

        PlayStore playStore = new PlayStore();
        boolean createApplication = playStore.createApplication(application);

        if(createApplication){
            playStore.getAppInfo();
        }
    }
}
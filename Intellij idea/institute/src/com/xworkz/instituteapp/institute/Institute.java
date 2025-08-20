package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.TraineeApp.TraineeApp;
import com.xworkz.instituteapp.validator.TraineeValidation;

public class Institute {

    TraineeApp traineeApp;
    public boolean createTraineeApp(TraineeApp traineeApp){
        boolean TraineeAppCreated = false;

        TraineeValidation traineeValidation = new TraineeValidation();

        boolean isTraineeAppValidated = traineeValidation.traineeValidation(traineeApp);

        if(isTraineeAppValidated){
            this.traineeApp = traineeApp;
            TraineeAppCreated = true;
        }
        return TraineeAppCreated;
    }
    public void getAppInfo();

    System.out.println("The institute name is "+traineeApp.getInstituteName());
    System.out.println("The institute id is "+traineeApp.getI)
}
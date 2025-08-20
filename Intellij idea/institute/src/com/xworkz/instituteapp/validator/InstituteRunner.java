package com.xworkz.instituteapp.validator;

import com.xworkz.instituteapp.TraineeApp.TraineeApp;
import com.xworkz.instituteapp.institute.Institute;

public class InstituteRunner {
    public static void main(String[] args) {

        TraineeApp traineeApp = new TraineeApp();
        traineeApp.setInstituteName("VKIT");
        traineeApp.setInstituteId(10);
        traineeApp.setTraineeName("XYZ");
        traineeApp.setNoOfStudents(100);
        traineeApp.setInstituteAddress("Bangalore");
        traineeApp.setAffiliatedTo("VTU");

        Institute institute = new Institute();
        boolean createTraineeApp = institute.createTraineeApp(traineeApp);

        if(createTraineeApp){
            institute.getInstituteInfo();
        }
    }
}

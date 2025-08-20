package com.xworkz.instituteapp.validator;

import com.xworkz.instituteapp.TraineeApp.TraineeApp;

public class TraineeValidation {


    public boolean traineeValidation(TraineeApp traineeApp) {
        boolean isTraineeValidated = false;

        boolean isInstituteNameValid = false;
        boolean isInstituteIdValid = false;
        boolean isTraineeNameValid = false;
        boolean isNoOfStudentsValid = false;
        boolean isInstituteAddressValid = false;
        boolean isAffiliatedToValid = false;

        if(traineeApp.getInstituteName() != null){
            isInstituteNameValid = true;
        }else{
            System.out.println("The institute name is not valid");
        }

        if(traineeApp.getInstituteId() != 0){
            isInstituteIdValid = true;
        }else{
            System.out.println("The institute id is not valid");
        }

        if (traineeApp.getTraineeName() != null) {
            isTraineeNameValid = true;
        }else{
            System.out.println("The trainee name is not valid");
        }

        if(traineeApp.getNoOfStudents() != 0){
            isNoOfStudentsValid = true;
        }else{
            System.out.println("The number of students are not valid");
        }

        if(traineeApp.getInstituteAddress() != null){
            isInstituteAddressValid = true;
        }else{
            System.out.println("The institute address is not valid");
        }

        if(traineeApp.getAffiliatedTo() != null){
            isAffiliatedToValid = true;
        }else{
            System.out.println("Affiliated to not valid ");
        }

        if(isInstituteNameValid && isInstituteIdValid && isTraineeNameValid && isNoOfStudentsValid && isInstituteAddressValid &&isAffiliatedToValid){
            isTraineeValidated = true;
        }

        return isTraineeValidated;
        }
}

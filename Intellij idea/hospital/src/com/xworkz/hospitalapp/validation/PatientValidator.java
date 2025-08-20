package com.xworkz.hospitalapp.validation;

import com.xworkz.hospitalapp.patient.PatientApp;

public class PatientValidator {

    public boolean validatePatientApp(PatientApp patientApp) {
        boolean isPatientAppValidated = false;

        boolean isHospitalNameValid = false;
        boolean isHospitalAddressValid = false;
        boolean isPatientNameValid = false;
        boolean isPatientIdValid = false;
        boolean isDiseaseValid = false;
        boolean isDateOnAdmittedValid = false;

        if (patientApp.getHospitalName() != null) {
            isHospitalNameValid = true;
        } else {
            System.out.println("The hospital name is not valid");
        }

        if (patientApp.getHospitalAddress() != null) {
            isHospitalAddressValid = true;
        } else {
            System.out.println("The hospital address is not valid");
        }

        if (patientApp.getPatientName() != null) {
            isPatientNameValid = true;
        } else {
            System.out.println("The patient name is not valid");
        }

        if (patientApp.getPatientId() != 0) {
            isPatientIdValid = true;
        } else {
            System.out.println("The patient id is not valid");
        }

        if (patientApp.getDisease() != null) {
            isDiseaseValid = true;
        } else {
            System.out.println("The disease is not valid");
        }

        if (patientApp.getDateOnAdmitted() != null) {
            isDateOnAdmittedValid = true;
        } else {
            System.out.println("The date on admitted is not valid");
        }

        if (isHospitalNameValid && isHospitalAddressValid && isPatientNameValid && isPatientIdValid && isDiseaseValid && isDateOnAdmittedValid) {
            isPatientAppValidated = true;
        }
    return isPatientAppValidated;
    }
}

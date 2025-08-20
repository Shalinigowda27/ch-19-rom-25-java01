package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.PatientApp;
import com.xworkz.hospitalapp.validation.PatientValidator;

public class Hospital {

    PatientApp patientApp;

    public boolean createPatientApp(PatientApp patientApp){
        boolean patientAppCreated = false;

        PatientValidator patientValidator =new PatientValidator();

        boolean isPatientAppValidated = patientValidator.validatePatientApp(patientApp);

        if(isPatientAppValidated){
            this.patientApp = patientApp;
            patientAppCreated = true;
        }
        return patientAppCreated;
    }
    public void getPatientAppInfo(){
        System.out.println("The hospital name is "+patientApp.getHospitalName());
        System.out.println("The hospital address is "+patientApp.getHospitalAddress());
        System.out.println("The patient name is "+patientApp.getPatientName());
        System.out.println("The patient id is "+patientApp.getPatientId());
        System.out.println("The disease name is "+patientApp.getDisease());
        System.out.println("The date on admitted is "+patientApp.getDateOnAdmitted());
    }
}

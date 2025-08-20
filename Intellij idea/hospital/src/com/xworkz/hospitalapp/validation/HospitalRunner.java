package com.xworkz.hospitalapp.validation;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.PatientApp;

public class HospitalRunner {
    public static void main(String[] args) {

        PatientApp patientApp = new PatientApp();
        patientApp.setHospitalName("Sparsh");
        patientApp.setHospitalAddress("Gorguntaepalya");
        patientApp.setPatientName("XYZ");
        patientApp.setPatientId(01);
        patientApp.setDisease("viral fever");
        patientApp.setDateOnAdmitted("10/08/2025");

        Hospital hospital = new Hospital();
        boolean createPatientApp = hospital.createPatientApp(patientApp);

        if(createPatientApp){
            hospital.getPatientAppInfo();
        }
    }
}

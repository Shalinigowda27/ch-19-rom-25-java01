package com.xworkz.hospitalapp.patient;

public class PatientApp {

    private String hospitalName;
    private String hospitalAddress;
    private String patientName;
    private int    patientId;
    private String disease;
    private String dateOnAdmitted;

    public String getHospitalName() {
        return hospitalName;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }
    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDateOnAdmitted() {
        return dateOnAdmitted;
    }
    public void setDateOnAdmitted(String dateOnAdmitted) {
        this.dateOnAdmitted = dateOnAdmitted;
    }




}

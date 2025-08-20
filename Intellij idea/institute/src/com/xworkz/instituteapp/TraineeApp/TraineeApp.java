package com.xworkz.instituteapp.TraineeApp;

public class TraineeApp {

    private String instituteName;
    private int    instituteId;
    private String traineeName;
    private int    noOfStudents;
    private String instituteAddress;
    private String affiliatedTo;

    public String getInstituteName() {
        return instituteName;
    }
    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public int getInstituteId() {
        return instituteId;
    }
    public void setInstituteId(int instituteId) {
        this.instituteId = instituteId;
    }

    public String getTraineeName() {
        return traineeName;
    }
    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }
    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String getInstituteAddress() {
        return instituteAddress;
    }
    public void setInstituteAddress(String instituteAddress) {
        this.instituteAddress = instituteAddress;
    }

    public String getAffiliatedTo() {
        return affiliatedTo;
    }
    public void setAffiliatedTo(String affiliatedTo) {
        this.affiliatedTo = affiliatedTo;
    }
}

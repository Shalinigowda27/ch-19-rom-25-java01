package com.xworkz.passportapp.user;

public class PassportUser {

    private String cpvLocation;
    private String dcdrLocation;
    private String givenName;
    private String surName;
    private String dob;
    private String email;
    private String password;


    public String getCpvLocation(){
        return cpvLocation;
    }
    public void setCpvLocation(String cpvLocation){
        this.cpvLocation = cpvLocation;
    }

    public String getDcdrLocation(){
        return dcdrLocation;
    }
    public void setDcdrLocation(String dcdrLocation) {
        this.dcdrLocation = dcdrLocation;
    }

    public String getGivenName(){
        return givenName;
    }
    public void setGivenName(String givenName){
        this.givenName = givenName;
    }

    public  String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }

    public String getDob(){
        return dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return  password;
    }
    public void setPassword(String password){
        this.password = password;
    }


}
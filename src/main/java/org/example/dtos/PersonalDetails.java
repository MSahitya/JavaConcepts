package org.example.dtos;


public  class PersonalDetails {
private String dateOfBirth;
private String nationality;
private String maritalStatus;

// Default constructor
public PersonalDetails() {}

// Getters and setters
public String getDateOfBirth() {
        return dateOfBirth;
        }

public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        }

public String getNationality() {
        return nationality;
        }

public void setNationality(String nationality) {
        this.nationality = nationality;
        }

public String getMaritalStatus() {
        return maritalStatus;
        }

public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        }

@Override
public String toString() {
        return "PersonalDetails{" +
        "dateOfBirth='" + dateOfBirth + '\'' +
        ", nationality='" + nationality + '\'' +
        ", maritalStatus='" + maritalStatus + '\'' +
        '}';
        }
        }

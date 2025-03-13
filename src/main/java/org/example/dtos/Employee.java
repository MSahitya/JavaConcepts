package org.example.dtos;

import java.util.Map;

public class Employee implements Comparable<Employee> {

    private String name;
    private String phone;
    private String email;
    private Address address;
    private PersonalDetails personalDetails;

    // Default constructor (required for Jackson)
    public Employee() {
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", personalDetails=" + personalDetails +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());

    }
}
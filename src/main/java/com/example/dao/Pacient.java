package com.example.dao;




import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Tomasz on 25.11.2016.
 */
@Entity
public class Pacient {

    @Id
    private int pesel;
    private String lastName;
    private String firstName;
    private Gender gender;
    private String street;
    private String city;
    private int phone;
    private String email;

    public Pacient(){};

    public Pacient(int pesel, String lastName, String firstName, Gender gender, String street, String city, int phone, String email) {
        this.pesel = pesel;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.street = street;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    public int getPesel() {
        return pesel;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

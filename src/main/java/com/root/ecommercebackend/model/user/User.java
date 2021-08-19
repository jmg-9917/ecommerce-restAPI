package com.root.ecommercebackend.model.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class User {
    @Id
    private int user_ID;
    private String first_name;
    private String last_name;
    private LocalDate date_of_birth;
    private String gender;
    private int primary_address;
    private int primary_phone;
    private int primary_email;
    private int primary_payment;

    public User(int user_ID, String first_name, String last_name, LocalDate date_of_birth, String gender, int primary_address, int primary_phone, int primary_email, int primary_payment) {
        this.user_ID = user_ID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.primary_address = primary_address;
        this.primary_phone = primary_phone;
        this.primary_email = primary_email;
        this.primary_payment = primary_payment;
    }

    public User() {

    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPrimary_address() {
        return primary_address;
    }

    public void setPrimary_address(int primary_address) {
        this.primary_address = primary_address;
    }

    public int getPrimary_phone() {
        return primary_phone;
    }

    public void setPrimary_phone(int primary_phone) {
        this.primary_phone = primary_phone;
    }

    public int getPrimary_email() {
        return primary_email;
    }

    public void setPrimary_email(int primary_email) {
        this.primary_email = primary_email;
    }

    public int getPrimary_payment() {
        return primary_payment;
    }

    public void setPrimary_payment(int primary_payment) {
        this.primary_payment = primary_payment;
    }
}

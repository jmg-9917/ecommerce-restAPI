package com.root.ecommercebackend.model.user;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Integer user_ID;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column(nullable = false)
    private LocalDate date_of_birth;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false, updatable = false)
    private Integer primary_address;
    @Column(nullable = false, updatable = false)
    private Integer primary_phone;
    @Column(nullable = false, updatable = false)
    private Integer primary_email;
    @Column(nullable = false, updatable = false)
    private Integer primary_payment;

    public User(Integer user_ID, String first_name, String last_name, LocalDate date_of_birth, String gender, Integer primary_address, Integer primary_phone, Integer primary_email, Integer primary_payment) {
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
    public void setUser_ID(Integer ID) {
        this.user_ID = user_ID;
    }

    public Integer getUser_ID() {
        return user_ID;
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

    public void setPrimary_address(Integer primary_address) {
        this.primary_address = primary_address;
    }

    public Integer getPrimary_phone() {
        return primary_phone;
    }

    public void setPrimary_phone(Integer primary_phone) {
        this.primary_phone = primary_phone;
    }

    public Integer getPrimary_email() {
        return primary_email;
    }

    public void setPrimary_email(Integer primary_email) {
        this.primary_email = primary_email;
    }

    public Integer getPrimary_payment() {
        return primary_payment;
    }

    public void setPrimary_payment(Integer primary_payment) {
        this.primary_payment = primary_payment;
    }
}

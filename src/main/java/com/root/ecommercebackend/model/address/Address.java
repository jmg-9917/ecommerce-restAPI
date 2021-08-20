package com.root.ecommercebackend.model.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
    @Id
    private Integer address_ID;
    @Column(nullable = false)
    private Integer user_ID;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String apt_suite;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private int zip_code;
    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private String address_type;
    @Column(nullable = false)
    private boolean primary_address;

    public Address(Integer address_ID, Integer user_id, String address, String apt_suite, String city, String state, int zip_code, String country, String address_type, boolean primary_address) {
        this.address_ID = address_ID;
        user_ID = user_id;
        this.address = address;
        this.apt_suite = apt_suite;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        this.country = country;
        this.address_type = address_type;
        this.primary_address = primary_address;
    }

    public Address() {

    }

    public int getAddress_ID() {
        return address_ID;
    }

    public void setAddress_ID(int address_ID) {
        this.address_ID = address_ID;
    }

    public Integer getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(Integer user_ID) {
        this.user_ID = user_ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getApt_suite() {
        return apt_suite;
    }

    public void setApt_suite(String apt_suite) {
        this.apt_suite = apt_suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress_type() {
        return address_type;
    }

    public void setAddress_type(String address_type) {
        this.address_type = address_type;
    }

    public boolean isPrimary_address() {
        return primary_address;
    }

    public void setPrimary_address(boolean primary_address) {
        this.primary_address = primary_address;
    }
}

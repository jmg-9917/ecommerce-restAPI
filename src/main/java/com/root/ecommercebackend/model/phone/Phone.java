package com.root.ecommercebackend.model.phone;

public class Phone {
    private int phone_ID;
    private int user_ID;
    private int country_code;
    private int area_code;
    private int phone_number;
    private int extention;
    private String phone_type;
    private boolean primary_phone;

    public Phone(int phone_ID, int user_ID, int country_code, int area_code, int phone_number, int extention, String phone_type, boolean primary_phone) {
        this.phone_ID = phone_ID;
        this.user_ID = user_ID;
        this.country_code = country_code;
        this.area_code = area_code;
        this.phone_number = phone_number;
        this.extention = extention;
        this.phone_type = phone_type;
        this.primary_phone = primary_phone;
    }

    public int getPhone_ID() {
        return phone_ID;
    }

    public void setPhone_ID(int phone_ID) {
        this.phone_ID = phone_ID;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public int getCountry_code() {
        return country_code;
    }

    public void setCountry_code(int country_code) {
        this.country_code = country_code;
    }

    public int getArea_code() {
        return area_code;
    }

    public void setArea_code(int area_code) {
        this.area_code = area_code;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int getExtention() {
        return extention;
    }

    public void setExtention(int extention) {
        this.extention = extention;
    }

    public String getPhone_type() {
        return phone_type;
    }

    public void setPhone_type(String phone_type) {
        this.phone_type = phone_type;
    }

    public boolean isPrimary_phone() {
        return primary_phone;
    }

    public void setPrimary_phone(boolean primary_phone) {
        this.primary_phone = primary_phone;
    }
}

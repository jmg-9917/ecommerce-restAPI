package com.root.ecommercebackend.model.payment;

public class Payment {
    private int payment_ID;
    private int user_ID;
    private String credit_card_number;
    private String credit_card_type;
    private String creditcard_name_different;
    private int credit_card_exp_month;
    private int credit_card_exp_year;
    private int credit_card_exp_code;
    private int credit_card_sec_code;
    private boolean primary_payment;

    public Payment(int payment_ID, int user_ID, String credit_card_number, String credit_card_type, String creditcard_name_different, int credit_card_exp_month, int credit_card_exp_year, int credit_card_exp_code, int credit_card_sec_code, boolean primary_payment) {
        this.payment_ID = payment_ID;
        this.user_ID = user_ID;
        this.credit_card_number = credit_card_number;
        this.credit_card_type = credit_card_type;
        this.creditcard_name_different = creditcard_name_different;
        this.credit_card_exp_month = credit_card_exp_month;
        this.credit_card_exp_year = credit_card_exp_year;
        this.credit_card_exp_code = credit_card_exp_code;
        this.credit_card_sec_code = credit_card_sec_code;
        this.primary_payment = primary_payment;
    }

    public int getPayment_ID() {
        return payment_ID;
    }

    public void setPayment_ID(int payment_ID) {
        this.payment_ID = payment_ID;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public String getCredit_card_number() {
        return credit_card_number;
    }

    public void setCredit_card_number(String credit_card_number) {
        this.credit_card_number = credit_card_number;
    }

    public String getCredit_card_type() {
        return credit_card_type;
    }

    public void setCredit_card_type(String credit_card_type) {
        this.credit_card_type = credit_card_type;
    }

    public String getCreditcard_name_different() {
        return creditcard_name_different;
    }

    public void setCreditcard_name_different(String creditcard_name_different) {
        this.creditcard_name_different = creditcard_name_different;
    }

    public int getCredit_card_exp_month() {
        return credit_card_exp_month;
    }

    public void setCredit_card_exp_month(int credit_card_exp_month) {
        this.credit_card_exp_month = credit_card_exp_month;
    }

    public int getCredit_card_exp_year() {
        return credit_card_exp_year;
    }

    public void setCredit_card_exp_year(int credit_card_exp_year) {
        this.credit_card_exp_year = credit_card_exp_year;
    }

    public int getCredit_card_exp_code() {
        return credit_card_exp_code;
    }

    public void setCredit_card_exp_code(int credit_card_exp_code) {
        this.credit_card_exp_code = credit_card_exp_code;
    }

    public int getCredit_card_sec_code() {
        return credit_card_sec_code;
    }

    public void setCredit_card_sec_code(int credit_card_sec_code) {
        this.credit_card_sec_code = credit_card_sec_code;
    }

    public boolean isPrimary_payment() {
        return primary_payment;
    }

    public void setPrimary_payment(boolean primary_payment) {
        this.primary_payment = primary_payment;
    }
}

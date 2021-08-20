package com.root.ecommercebackend.model.payment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    private Integer payment_ID;
    @Column(nullable = false)
    private int user_ID;
    @Column(nullable = false)
    private String credit_card_number;
    @Column(nullable = false)
    private String credit_card_type;
    @Column(nullable = false)
    private String credit_card_name_different;
    @Column(nullable = false)
    private int credit_card_exp_month;
    @Column(nullable = false)
    private int credit_card_exp_year;
    @Column(nullable = false)
    private int credit_card_exp_code;
    @Column(nullable = false)
    private int credit_card_sec_code;
    @Column(nullable = false)
    private boolean primary_payment;

    public Payment(int payment_ID, int user_ID, String credit_card_number, String credit_card_type, String credit_card_name_different, int credit_card_exp_month, int credit_card_exp_year, int credit_card_exp_code, int credit_card_sec_code, boolean primary_payment) {
        this.payment_ID = payment_ID;
        this.user_ID = user_ID;
        this.credit_card_number = credit_card_number;
        this.credit_card_type = credit_card_type;
        this.credit_card_name_different = credit_card_name_different;
        this.credit_card_exp_month = credit_card_exp_month;
        this.credit_card_exp_year = credit_card_exp_year;
        this.credit_card_exp_code = credit_card_exp_code;
        this.credit_card_sec_code = credit_card_sec_code;
        this.primary_payment = primary_payment;
    }

    public Payment() {

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

    public String getCredit_card_name_different() {
        return credit_card_name_different;
    }

    public void setCredit_card_name_different(String creditcard_name_different) {
        this.credit_card_name_different = creditcard_name_different;
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

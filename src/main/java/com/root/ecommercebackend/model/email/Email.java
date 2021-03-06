package com.root.ecommercebackend.model.email;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "email")
public class Email {
    @Id
    private Integer email_ID;
    @Column(nullable = false)
    private int user_ID;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String email_type;
    @Column(nullable = false)
    private boolean primary_email;

    public Email(int email_ID, int user_ID, String email, String email_type, boolean primary_email) {
        this.email_ID = email_ID;
        this.user_ID = user_ID;
        this.email = email;
        this.email_type = email_type;
        this.primary_email = primary_email;
    }

    public Email() {

    }


    public int getEmail_ID() {
        return email_ID;
    }

    public void setEmail_ID(int email_ID) {
        this.email_ID = email_ID;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail_type() {
        return email_type;
    }

    public void setEmail_type(String email_type) {
        this.email_type = email_type;
    }

    public boolean isPrimary_email() {
        return primary_email;
    }

    public void setPrimary_email(boolean primary_email) {
        this.primary_email = primary_email;
    }
}

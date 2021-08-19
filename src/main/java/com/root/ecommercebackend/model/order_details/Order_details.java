package com.root.ecommercebackend.model.order_details;


import java.time.LocalDate;

public class Order_details {
    private int order_ID;
    private int user_ID;
    private int cart_ID;
    private int payment_ID;
    private String payment_date;
    private LocalDate order_date;
    private LocalDate ship_date;
    private String ship_method;
    private LocalDate fullfillment_date;
    private LocalDate cancelation_date;
    private LocalDate return_date;

    public Order_details(int order_ID, int user_ID, int cart_ID, int payment_ID, String payment_date, LocalDate order_date, LocalDate ship_date, String ship_method, LocalDate fullfillment_date, LocalDate cancelation_date, LocalDate return_date) {
        this.order_ID = order_ID;
        this.user_ID = user_ID;
        this.cart_ID = cart_ID;
        this.payment_ID = payment_ID;
        this.payment_date = payment_date;
        this.order_date = order_date;
        this.ship_date = ship_date;
        this.ship_method = ship_method;
        this.fullfillment_date = fullfillment_date;
        this.cancelation_date = cancelation_date;
        this.return_date = return_date;
    }

    public int getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(int order_ID) {
        this.order_ID = order_ID;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public int getCart_ID() {
        return cart_ID;
    }

    public void setCart_ID(int cart_ID) {
        this.cart_ID = cart_ID;
    }

    public int getPayment_ID() {
        return payment_ID;
    }

    public void setPayment_ID(int payment_ID) {
        this.payment_ID = payment_ID;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public LocalDate getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }

    public LocalDate getShip_date() {
        return ship_date;
    }

    public void setShip_date(LocalDate ship_date) {
        this.ship_date = ship_date;
    }

    public String getShip_method() {
        return ship_method;
    }

    public void setShip_method(String ship_method) {
        this.ship_method = ship_method;
    }

    public LocalDate getFullfillment_date() {
        return fullfillment_date;
    }

    public void setFullfillment_date(LocalDate fullfillment_date) {
        this.fullfillment_date = fullfillment_date;
    }

    public LocalDate getCancelation_date() {
        return cancelation_date;
    }

    public void setCancelation_date(LocalDate cancelation_date) {
        this.cancelation_date = cancelation_date;
    }

    public LocalDate getReturn_date() {
        return return_date;
    }

    public void setReturn_date(LocalDate return_date) {
        this.return_date = return_date;
    }
}

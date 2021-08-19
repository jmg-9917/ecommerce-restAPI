package com.root.ecommercebackend.model.cart;

public class Cart {
    public int getCart_ID() {
        return cart_ID;
    }

    public void setCart_ID(int cart_ID) {
        this.cart_ID = cart_ID;
    }

    public int getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(int order_ID) {
        this.order_ID = order_ID;
    }

    public int getProduct_ID() {
        return product_ID;
    }

    public void setProduct_ID(int product_ID) {
        this.product_ID = product_ID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    private int cart_ID;
    private int order_ID;
    private int product_ID;
    private int quantity;
    private int discount;

    public Cart(int cart_ID, int order_ID, int product_ID, int quantity, int discount) {
        this.cart_ID = cart_ID;
        this.order_ID = order_ID;
        this.product_ID = product_ID;
        this.quantity = quantity;
        this.discount = discount;
    }
}

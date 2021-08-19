package com.root.ecommercebackend.model.product_catalog;

public class Product_catalog {
    private int product_ID;
    private String product_name;
    private int vendor_ID;
    private String manufacturer_ID;
    private int color_ID;
    private int size_ID;
    private int unit_ID;
    private int price_per_unit;
    private int weight_per_unit;

    public int getProduct_ID() {
        return product_ID;
    }

    public void setProduct_ID(int product_ID) {
        this.product_ID = product_ID;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getVendor_ID() {
        return vendor_ID;
    }

    public void setVendor_ID(int vendor_ID) {
        this.vendor_ID = vendor_ID;
    }

    public String getManufacturer_ID() {
        return manufacturer_ID;
    }

    public void setManufacturer_ID(String manufacturer_ID) {
        this.manufacturer_ID = manufacturer_ID;
    }

    public int getColor_ID() {
        return color_ID;
    }

    public void setColor_ID(int color_ID) {
        this.color_ID = color_ID;
    }

    public int getSize_ID() {
        return size_ID;
    }

    public void setSize_ID(int size_ID) {
        this.size_ID = size_ID;
    }

    public int getUnit_ID() {
        return unit_ID;
    }

    public void setUnit_ID(int unit_ID) {
        this.unit_ID = unit_ID;
    }

    public int getPrice_per_unit() {
        return price_per_unit;
    }

    public void setPrice_per_unit(int price_per_unit) {
        this.price_per_unit = price_per_unit;
    }

    public int getWeight_per_unit() {
        return weight_per_unit;
    }

    public void setWeight_per_unit(int weight_per_unit) {
        this.weight_per_unit = weight_per_unit;
    }

    public Product_catalog(int product_ID, String product_name, int vendor_ID, String manufacturer_ID, int color_ID, int size_ID, int unit_ID, int price_per_unit, int weight_per_unit) {
        this.product_ID = product_ID;
        this.product_name = product_name;
        this.vendor_ID = vendor_ID;
        this.manufacturer_ID = manufacturer_ID;
        this.color_ID = color_ID;
        this.size_ID = size_ID;
        this.unit_ID = unit_ID;
        this.price_per_unit = price_per_unit;
        this.weight_per_unit = weight_per_unit;
    }
}

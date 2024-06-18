package org.lessons.java.inheritance.shop;

import java.util.Random;

public class Product {
    private final int id;
    Random random = new Random();
    private String name;
    private String brand;
    private float price;
    private int vat;
    private float grossPrice = 0;

    public Product(String name, String brand, float price, int vat) {
        this.id = Math.abs(random.nextInt());
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return String.format("The NET price is: € %.2f", this.price);
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setGrossPrice() {
        this.grossPrice = price + (price * vat) / 100;
    }

    public String getVat() {
        return "The VAT is: " + this.vat + "%";
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public String grossPrice() {
        setGrossPrice();
        return String.format("The gross price is: € %.2f", this.grossPrice);
    }

    public String completeName() {
        return this.id + "-" + this.name;
    }
}
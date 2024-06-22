package org.lessons.java.inheritance.shop;

import java.util.Random;

/**
 * Class for the product
 */

public class Product {
    private final int id;
    Random random = new Random();
    private String name;
    private String brand;
    private float price;
    private int vat;
    private float grossPrice;

    /**
     * Constructor for the product
     *
     * @param name  name of the product
     * @param brand brand of the product
     * @param price net price of the product
     * @param vat   vat of the product
     */

    public Product(String name, String brand, float price, int vat) {
        this.id = Math.abs(random.nextInt());
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
    }

    /**
     * Method to get the id
     *
     * @return the automatically generated id
     */

    public int getId() {
        return id;
    }

    /**
     * Method to get the name of the product
     *
     * @return the name of the product
     */

    public String getName() {
        return name;
    }

    /**
     * Method to set the name of the product
     *
     * @param name the name of the product
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get the brand of the product
     *
     * @return the brand of the product
     */

    public String getBrand() {
        return brand;
    }

    /**
     * Method to set the brand of the product
     *
     * @param brand the brand of the product
     */

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Method to get the net price of the product
     *
     * @return the net price of the product
     */

    public String getPrice() {
        return String.format("The NET price is: € %.2f", this.price);
    }

    /**
     * Method to set the net price of the product
     *
     * @param price the net price of the product
     */

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Method to set the gross price of the product
     */

    public void setGrossPrice() {
        this.grossPrice = price + (price * vat) / 100;
    }

    /**
     * Method to get the vat of the product
     *
     * @return the vat of the product
     */

    public String getVat() {
        return "The VAT is: " + this.vat + "%";
    }

    /**
     * Method to set the vat of the product
     *
     * @param vat the vat of the product
     */

    public void setVat(int vat) {
        this.vat = vat;
    }

    /**
     * Method to get the gross price of the product
     *
     * @return the gross price of the product
     */

    public String grossPrice() {
        setGrossPrice();
        return String.format("The gross price is: € %.2f", this.grossPrice);
    }

    /**
     * Method to get the complete name of the product
     *
     * @return the complete name of the product as id-name
     */

    public String completeName() {
        return this.id + "-" + this.name;
    }

    @Override
    public String toString() {
        return "id=" + id + ", " + "\n" +
                "name=" + name + ", " + "\n" +
                "brand=" + brand + ", " + "\n" +
                "price=" + price + ", " + "\n" +
                "VAT=" + vat + "%, " + "\n" +
                "grossPrice=" + grossPrice;
    }
}
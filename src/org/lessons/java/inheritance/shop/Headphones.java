package org.lessons.java.inheritance.shop;

public class Headphones extends Product {
    private String color;
    private boolean wireless;
    public Headphones(String name, String brand, float price, int vat, String color, boolean wireless) {
        super(name, brand, price, vat);
        this.color = color;
        this.wireless = wireless;
    }

    public String getColor() {
        return color;
    }
    public String getWireless() {
        if (wireless) {
            return "The headphones are wireless";
        } else {
            return "The headphones are not wireless";
        }
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}

package org.lessons.java.inheritance.shop;

public class Headphones extends Product {
    private String color;
    private String wireless;

    public Headphones(String name, String brand, float price, int vat, String color, String wireless) {
        super(name, brand, price, vat);
        this.color = color;
        this.wireless = wireless;
    }

    public String getColor() {
        return color;
    }

    public String getWireless() {
        if (wireless.equals("y")) {
            return "The headphones are wireless";
        } else {
            return "The headphones are not wireless";
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Headphones {" + "\n" +
                super.toString() + "\n" +
                "color=" + color + ", " + "\n" +
                getWireless() +
                " }" + "\n";
    }
}

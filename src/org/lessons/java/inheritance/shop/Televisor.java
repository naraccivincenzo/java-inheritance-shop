package org.lessons.java.inheritance.shop;

public class Televisor extends Product {
    private int size;
    private boolean smart;
    public Televisor(String name, String brand, float price, int vat, int size, boolean smart) {
        super(name, brand, price, vat);
        this.size = size;
        this.smart = smart;
    }

    public int getSize() {
        return size;
    }
    public String getSmart() {
        if (smart) {
            return "The televisor is smart";
        } else {
            return "The televisor is not smart";
        }
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}

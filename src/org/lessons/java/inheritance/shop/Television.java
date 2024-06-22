package org.lessons.java.inheritance.shop;

public class Television extends Product {
    private int size;
    private String smart;

    public Television(String name, String brand, float price, int vat, int size, String smart) {
        super(name, brand, price, vat);
        this.size = size;
        this.smart = smart;
    }

    public int getSize() {
        return size;
    }

    public String getSmart() {
        if (smart.equals("y")) {
            return "The televisor is smart";
        } else {
            return "The televisor is not smart";
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Television {" + "\n" +
                super.toString() + "\n" +
                "size=" + size + ", " + "\n" +
                getSmart() +
                " }" + "\n";
    }
}

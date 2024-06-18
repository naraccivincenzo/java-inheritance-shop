package org.lessons.java.inheritance.shop;

public class Main {

    public static void main(String[] args) {
        Headphones h = new Headphones("JBL", "JBL", 200, 20, "black", true);
        System.out.println(h.getWireless());
        System.out.println(h.getColor());

        Televisor t = new Televisor("Samsung", "Samsung", 300, 30, 55, true);
        System.out.println(t.getSmart());
        System.out.println(t.getSize());

        Smartphone s = new Smartphone("iPhone", "Apple", 400, 40, 123456789, 32, 128);
        System.out.println(s.getImei());
        System.out.println(s.getRam());
        System.out.println(s.getRom());
    }
}

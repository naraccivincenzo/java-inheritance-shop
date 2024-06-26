package org.lessons.java.inheritance.shop;

public class Smartphone extends Product {
    private int imei;
    private int ram;
    private int rom;

    public Smartphone(String name, String brand, float price, int vat, int ram, int rom) {
        super(name, brand, price, vat);
        this.imei = Math.abs(random.nextInt());
        this.ram = ram;
        this.rom = rom;
    }

    public int getImei() {
        return imei;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "Smartphone {" + "\n" +
                super.toString() + "\n" +
                "imei=" + imei + ", " + "\n" +
                "ram=" + ram + ", " + "\n" +
                "rom=" + rom +
                " }" + "\n";
    }
}

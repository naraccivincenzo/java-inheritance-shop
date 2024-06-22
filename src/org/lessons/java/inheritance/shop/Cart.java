package org.lessons.java.inheritance.shop;

import java.util.Scanner;

public class Cart {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What kind of product do you want to buy?");
        System.out.println("1. Smartphone");
        System.out.println("2. Televisor");
        System.out.println("3. Headphones");
        int choice = scanner.nextInt();
        System.out.println("Enter the name of the product:");
        String name = scanner.nextLine();
        System.out.println("Enter the brand of the product:");
        String brand = scanner.nextLine();
        System.out.println("Enter the price of the product:");
        float price = scanner.nextFloat();
        System.out.println("Enter the vat of the product:");
        int vat = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the ram:");
                int ram = scanner.nextInt();
                System.out.println("Enter the rom:");
                int rom = scanner.nextInt();
                Smartphone smartphone = new Smartphone(name, brand, price, vat, ram, rom);

                break;
            case 2:
                System.out.println("Enter the size:");
                int size = scanner.nextInt();
                System.out.println("Enter the smart:");
                boolean smart = scanner.nextBoolean();

                Televisor televisor = new Televisor(name, brand, price, vat, size, smart);
                break;
            case 3:
                System.out.println("Enter the color:");
                String color = scanner.next();
                System.out.println("Enter the wireless:");
                boolean wireless = scanner.nextBoolean();
                Headphones headphones = new Headphones(name, brand, price, vat, color, wireless);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("Do you want to add some other items? (y/n)");
        String answer = scanner.next();
        if (answer.equals("y")) {
            main(args);
        }

    }
}

package org.lessons.java.inheritance.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.println("Do you want to add some items to your cart? (y/n)");
        String answer = scanner.next();

        while (answer.equalsIgnoreCase("y")) {
            System.out.println("What kind of product do you want to buy?");
            System.out.println("1. Smartphone");
            System.out.println("2. Television");
            System.out.println("3. Headphones");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the name of the product:");
            String name = scanner.nextLine();
            System.out.println("Enter the brand of the product:");
            String brand = scanner.nextLine();
            System.out.println("Enter the price of the product:");
            float price = scanner.nextFloat();
            System.out.println("Enter the VAT of the product:");
            int vat = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the RAM:");
                    int ram = scanner.nextInt();
                    System.out.println("Enter the ROM:");
                    int rom = scanner.nextInt();
                    Smartphone smartphone = new Smartphone(name, brand, price, vat, ram, rom);
                    products.add(smartphone);
                    break;
                case 2:
                    System.out.println("Enter the size:");
                    int size = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Is it smart? (y/n)");
                    String smart = scanner.nextLine();
                    Television television = new Television(name, brand, price, vat, size, smart);
                    products.add(television);
                    break;
                case 3:
                    System.out.println("Enter the color:");
                    scanner.nextLine();
                    String color = scanner.nextLine();
                    System.out.println("Are they wireless? (y/n)");
                    String wireless = scanner.nextLine();
                    Headphones headphones = new Headphones(name, brand, price, vat, color, wireless);
                    products.add(headphones);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Do you want to add more items to your cart? (y/n)");
            answer = scanner.next();
        }

        if (!products.isEmpty()) {
            System.out.println("Thank you for shopping!");
            System.out.println("Your cart contains:");
            for (Product p : products) {
                System.out.println(p);
            }
        } else {
            System.out.println("Your cart is empty.");
        }

        scanner.close();
    }
}

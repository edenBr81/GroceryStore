package com.example.grocerystore;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Item newItem;
        boolean condition = false;
        double tax = 0.6;
        String answer;
        double totalPrice;
        double totalPriceAfterTax;

        ArrayList<Item> items = new ArrayList<>();

        do {
            newItem = new Item();
            System.out.println("Enter Description:");
            newItem.setDescription(scan.nextLine());
            System.out.println("Enter Price");
            newItem.setPrice(scan.nextDouble());
            scan.nextLine();
            System.out.println("Enter Quantity");
            newItem.setQuantity(scan.nextDouble());
            scan.nextLine();

            items.add(newItem);


            totalPrice = newItem.getPrice() * newItem.getQuantity();
            totalPriceAfterTax = totalPrice + tax;


            System.out.println("Do you want enter another item?");
            answer = scan.nextLine();

            if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                condition = true;
            }

        } while (!condition);

        //System.out.println("Description" + "          " + "Unit Price" + "          " + "Quantity" + "        " + "Total Price");
        for (Item eachitem : items) {
            System.out.println(eachitem.getDescription());
            System.out.println(eachitem.getPrice());
            System.out.println(eachitem.getQuantity());
            System.out.println(totalPrice);
            System.out.println(totalPriceAfterTax);
            System.out.println("=========================");

        }


    }
    }


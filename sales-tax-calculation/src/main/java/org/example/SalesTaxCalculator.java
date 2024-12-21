package org.example;

import java.io.*;
import java.util.*;

public class SalesTaxCalculator {

    public static void main(String[] args) {
        String fileName = "src/main/resources/input.csv";
        List<Item> items = readItemsFromFile(fileName);
        TaxCalculator taxCalculator = new TaxCalculator();

        double totalTax = 0;
        double totalCost = 0;

        for (Item item : items) {
            double tax = taxCalculator.calculateTax(item);
            item.setTax(tax);
            item.setTotalPrice(item.getPrice() + tax);

            totalTax += tax;
            totalCost += item.getTotalPrice();
        }

        for (Item item : items) {
            System.out.printf("%s: $%.2f (Tax: $%.2f)%n", item.getName(), item.getPrice(), item.getTax());
        }
        
        System.out.printf("Total Tax: $%.2f%n", totalTax);
        System.out.printf("Total Price: $%.2f%n", totalCost);
    }

    private static List<Item> readItemsFromFile(String fileName) {
        List<Item> items = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String category = parts[1];
                double price = Double.parseDouble(parts[2]);
                double taxRate = Double.parseDouble(parts[3]);
                items.add(new Item(name, category, price, taxRate));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return items;
    }

}

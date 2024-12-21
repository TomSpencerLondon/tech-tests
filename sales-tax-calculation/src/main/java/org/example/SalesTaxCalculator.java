package org.example;

import java.util.*;
import java.util.logging.Logger;

public class SalesTaxCalculator {

    public static void main(String[] args) {
        String fileName = "src/main/resources/input.csv";
        Logger logger = Logger.getLogger(CsvReader.class.getName());
        ItemRepository csvReader = new CsvReader(fileName, logger);
        List<Item> items = csvReader.findAll();
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

}

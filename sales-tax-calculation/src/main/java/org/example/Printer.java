package org.example;

import org.example.repository.Item;

import java.math.BigDecimal;
import java.util.List;

public class Printer {

    public void print(List<Item> items, BigDecimal totalTax, BigDecimal totalCost) {
        for (Item item : items) {
            System.out.printf("%s: $%.2f (Tax: $%.2f)%n", item.getName(), item.getPrice(), item.getTax());
        }

        System.out.printf("Total Tax: $%.2f%n", totalTax);
        System.out.printf("Total Price: $%.2f%n", totalCost);
    }
}

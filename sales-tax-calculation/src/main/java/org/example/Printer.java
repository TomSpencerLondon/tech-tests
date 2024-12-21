package org.example;

import org.example.repository.Item;

public class Printer {
    private final Checkout checkout;

    public Printer(Checkout checkout) {
        this.checkout = checkout;
    }

    public void print() {
        for (Item item : checkout.items()) {
            System.out.printf("%s: $%.2f (Tax: $%.2f)%n", item.getName(), item.getPrice(), item.getTax());
        }

        System.out.printf("Total Tax: $%.2f%n", checkout.totalTax());
        System.out.printf("Total Price: $%.2f%n", checkout.totalCost());
    }
}

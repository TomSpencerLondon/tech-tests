package org.example;

public class TaxCalculator {
    public double calculateTax(Item item) {
        double result = item.getPrice() * item.getTaxRate();

        return Math.round(result * 100.00) / 100.00;
    }
}

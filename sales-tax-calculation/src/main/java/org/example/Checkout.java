package org.example;

import org.example.repository.Item;

import java.math.BigDecimal;
import java.util.List;

public class Checkout {
    private BigDecimal totalTax;
    private BigDecimal totalCost;
    private List<Item> items;

    public Checkout(List<Item> items) {
        this.items = items;
        this.totalTax = new BigDecimal(0);
        this.totalCost = new BigDecimal(0);
    }

    public void process() {
        for (Item item : items) {
            double tax = calculateTax(item);
            item.setTax(tax);
            item.setTotalPrice(item.getPrice() + tax);
            addTax(new BigDecimal(Double.toString(tax)));
            addPrice(new BigDecimal(Double.toString(item.getTotalPrice())));
        }
    }

    public List<Item> items() {
        return this.items;
    }

    public double calculateTax(Item item) {
        double result = item.getPrice() * item.getTaxRate();

        return Math.round(result * 100.00) / 100.00;
    }

    public BigDecimal totalTax() {
        return totalTax;
    }

    public BigDecimal totalCost() {
        return totalCost;
    }

    public void addTax(BigDecimal tax) {
        this.totalTax = totalTax.add(tax);
    }

    public void addPrice(BigDecimal price) {
        this.totalCost = totalCost.add(price);
    }
}

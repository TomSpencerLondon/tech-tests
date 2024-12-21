package org.example;

class Item {
    private String name;
    private String category;
    private double price;
    private double taxRate;
    private double tax;
    private double totalPrice;

    public Item(String name, String category, double price, double taxRate) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.taxRate = taxRate;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

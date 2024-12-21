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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(price, item.price) != 0) return false;
        if (Double.compare(taxRate, item.taxRate) != 0) return false;
        if (Double.compare(tax, item.tax) != 0) return false;
        if (Double.compare(totalPrice, item.totalPrice) != 0) return false;
        if (!name.equals(item.name)) return false;
        return category.equals(item.category);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + category.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(taxRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tax);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

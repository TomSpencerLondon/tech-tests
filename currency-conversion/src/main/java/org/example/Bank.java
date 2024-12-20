package org.example;

public class Bank {
    public double convertCurrency(double amount, double rate) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negative amount");
        } else if (amount > 1_000_000) {
            throw new IllegalArgumentException("Excessively large amount");
        }

        double result = amount * rate;
        return Math.round(result * 100.0) / 100.0;
    }
}

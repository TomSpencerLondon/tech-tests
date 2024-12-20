package org.example;

public enum Currency {
    EUR("€"), USD("$"), GBP("£"), JPY("¥"), INR("₹");

    private final String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

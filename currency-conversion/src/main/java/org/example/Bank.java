package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Bank {

    Map<Pair, BigDecimal> currencyMap;

    public Bank() {
        this.currencyMap = new HashMap<>();
    }

    public void addConversionRate(Pair pair, BigDecimal conversionRate) {
        currencyMap.put(pair, conversionRate);
    }

    public double convertCurrency(double amount, double rate) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negative amount");
        } else if (amount > 1_000_000) {
            throw new IllegalArgumentException("Excessively large amount");
        }

        double result = amount * rate;
        return Math.round(result * 100.0) / 100.0;
    }

    public Money convert(Money money, Pair pair) {
        BigDecimal conversionRate = currencyMap.get(pair);

        return money.convert(conversionRate, pair.to());
    }
}

package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {
    private final BigDecimal amount;
    private final Currency currency;

    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public BigDecimal amount() {
        return amount.setScale(2, RoundingMode.HALF_UP);
    }

    public Currency currency() {
        return currency;
    }

    public Money convert(BigDecimal conversionRate, Currency destinationCurrency) {
        return new Money(this.amount.multiply(conversionRate), destinationCurrency);
    }
}

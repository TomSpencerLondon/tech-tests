package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void convertsToDestinationCurrency() {
        Money money = new Money(new BigDecimal("100"), Currency.USD);
        BigDecimal conversionRate = new BigDecimal("0.9518");

        Money convertedAmount = money.convert(conversionRate, Currency.EUR);

        assertEquals(new BigDecimal("95.18"), convertedAmount.amount());
        assertEquals(Currency.EUR, convertedAmount.currency());
    }
}

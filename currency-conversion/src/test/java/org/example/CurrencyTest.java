package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyTest {
    @Test
    void returnCorrectSymbolForCurrency() {
        Currency currency = Currency.EUR;

        assertEquals(currency.getSymbol(), "€");
    }
}

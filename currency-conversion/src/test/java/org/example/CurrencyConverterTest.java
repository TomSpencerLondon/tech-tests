package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CurrencyConverterTest {

    @Test
    void convertsDollarsToEuros() {
//      1 dollar = 0.9518 Euros (dollars to euros)
        double result = CurrencyConverter.convertCurrency(100, 0.9518);

        assertEquals(95.18, result);
    }

    @Test
    void convertsJapaneseYenToDollars() {
//      1 JPY = 0.006656 USD
        double result = CurrencyConverter.convertCurrency(0, 0.006656);

        assertEquals(0, result);
    }

    @Test
    void convertsUSDollarsToIndianRupees() {
//        1 USD = 84.80 INR
        double result = CurrencyConverter.convertCurrency(150.75, 0.848);

        assertEquals(127.84, result);
    }

    @Test
    void convertsUSDollarsToEuros() {
        //        1 USD = 84.80 INR
        double result = CurrencyConverter.convertCurrency(150.75, 0.848);

        assertEquals(127.84, result);
    }

    @Test
    void negativeNumbersThrowsIllegalArgumentException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> CurrencyConverter.convertCurrency(-50, 1.26935));
    }

    @Test
    void amountsOverOneMillionThrowIllegalArgumentException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> CurrencyConverter.convertCurrency(1_000_001, 1.26935));
    }

    @Test
    void noExcessivePrecision() {
        assertThrows(
                IllegalArgumentException.class,
                () -> CurrencyConverter.convertCurrency(1_000_001, 1.26935));
    }

    //7,10_000_000_000,USD,EUR,Excessively large amount
//8,10.123456789,EUR,USD,Excessive precision
//9,75,GBP,USD,Valid Entry

}

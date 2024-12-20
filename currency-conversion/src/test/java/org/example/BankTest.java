package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {

    private Bank bank;
    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @Nested
    class OldConvertCurrency {

        @Test
        void convertsDollarsToEuros() {
//      1 dollar = 0.9518 Euros (dollars to euros)
            double result = bank.convertCurrency(100, 0.9518);

            assertEquals(95.18, result);
        }

        @Test
        void convertsJapaneseYenToDollars() {
//      1 JPY = 0.006656 USD
            double result = bank.convertCurrency(0, 0.006656);

            assertEquals(0, result);
        }

        @Test
        void convertsUSDollarsToIndianRupees() {
//        1 USD = 84.80 INR
            double result = bank.convertCurrency(150.75, 0.848);

            assertEquals(127.84, result);
        }

        @Test
        void convertsEurosToDollars() {
            //        EUR to Dollars = 0.9527
            double result = bank.convertCurrency(10.123456789, 1.0519);

            assertEquals(10.65, result);
        }

        @Test
        void convertsGBPToDollars() {
//            1.2695

            double result = bank.convertCurrency(75, 1.2695);

            assertEquals(95.21, result);
        }

        @Test
        void negativeNumbersThrowsIllegalArgumentException() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> bank.convertCurrency(-50, 1.26935));
        }

        @Test
        void amountsOverOneMillionThrowIllegalArgumentException() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> bank.convertCurrency(1_000_001, 1.26935));
        }

        @Test
        void noExcessivePrecision() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> bank.convertCurrency(1_000_001, 1.26935));
        }
    }

    @Nested
    class NewConvert {
        @Test
        void givenMoneyAndCurrencyPairConvertsCorrectly() {
            Pair pair = new Pair(Currency.USD, Currency.EUR);
            BigDecimal conversionRate = new BigDecimal("0.9518");
            bank.addConversionRate(pair, conversionRate);
            BigDecimal amount = new BigDecimal("100");
            Money money = new Money(amount, Currency.USD);

            Money result = bank.convert(money, pair);

            assertEquals(new BigDecimal("95.18"), result.amount());
            assertEquals(Currency.EUR, result.currency());
        }
    }
}

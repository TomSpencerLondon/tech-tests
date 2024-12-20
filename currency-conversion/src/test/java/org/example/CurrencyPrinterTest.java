package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyPrinterTest {
    @Mock
    Logger logger;

    @Test
    void printsCorrectOutputFor() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        Bank bank = new Bank();
        bank.addConversionRate(new Pair(Currency.USD, Currency.EUR), new BigDecimal("0.9518"));
        bank.addConversionRate(new Pair(Currency.JPY, Currency.USD), new BigDecimal("0.006656"));
        bank.addConversionRate(new Pair(Currency.USD, Currency.INR), new BigDecimal("0.848"));
        bank.addConversionRate(new Pair(Currency.EUR, Currency.USD), new BigDecimal("1.0519"));
        bank.addConversionRate(new Pair(Currency.GBP, Currency.USD), new BigDecimal("1.2695"));

//9,75,GBP,USD,Valid Entry

        CurrencyPrinter currencyPrinter = new CurrencyPrinter(
                bank,
                new CsvReader("src/test/resources/valid_currencies.csv", logger));



        currencyPrinter.print();

        String result = byteArrayOutputStream.toString();
        assertEquals(result,
                "----- Currency Conversion Results ----\n" +
                "TransactionId: 1, USD to EUR: €95.18\n" +
                "TransactionId: 4, JPY to USD: $0.00\n" +
                "TransactionId: 5, USD to INR: ₹127.84\n" +
                "TransactionId: 8, EUR to USD: $10.65\n" +
                "TransactionId: 9, GBP to USD: $95.21\n"
        );
    }
}

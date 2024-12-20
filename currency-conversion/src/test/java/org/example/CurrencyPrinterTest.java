package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyPrinterTest {

    @Test
    void printsCorrectOutputFor() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        Bank bank = new Bank();
        bank.addConversionRate(new Pair(Currency.USD, Currency.EUR), new BigDecimal("0.9518"));

        CurrencyPrinter currencyPrinter = new CurrencyPrinter(
                bank,
                new CsvReader("src/test/resources/test_currencies.csv"));

        currencyPrinter.print();

        String result = byteArrayOutputStream.toString();
        assertEquals(result,
                "----- Currency Conversion Results ----\n" +
                "TransactionId: 1, USD to EUR: €95.18\n");
    }
}

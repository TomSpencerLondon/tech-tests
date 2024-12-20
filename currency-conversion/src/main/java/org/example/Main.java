package org.example;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFile = "src/main/resources/currencies.csv";
        CsvReader csvReader = new CsvReader(csvFile);
        Bank bank = new Bank();
        bank.addConversionRate(new Pair(Currency.USD, Currency.EUR), new BigDecimal("0.9518"));
        CurrencyPrinter currencyPrinter = new CurrencyPrinter(bank, csvReader);
        currencyPrinter.print();
    }
}

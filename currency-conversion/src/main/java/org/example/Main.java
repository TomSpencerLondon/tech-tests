package org.example;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        String csvFile = "src/main/resources/currencies.csv";
        CsvReader csvReader = new CsvReader(csvFile, Logger.getLogger(CsvReader.class.getName()));
        Bank bank = new Bank();
        bank.addConversionRate(new Pair(Currency.USD, Currency.EUR), new BigDecimal("0.9518"));
        CurrencyPrinter currencyPrinter = new CurrencyPrinter(bank, csvReader);
        currencyPrinter.print();
    }
}

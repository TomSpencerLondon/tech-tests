package org.example;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        String csvFile = "src/main/resources/currencies.csv";
        CsvReader csvReader = new CsvReader(csvFile, Logger.getLogger(CsvReader.class.getName()));
        Bank bank = new Bank();
        bank.addConversionRate(new Pair(Currency.USD, Currency.EUR), new BigDecimal("0.9518"));
        bank.addConversionRate(new Pair(Currency.JPY, Currency.USD), new BigDecimal("0.006656"));
        bank.addConversionRate(new Pair(Currency.USD, Currency.INR), new BigDecimal("0.848"));
        bank.addConversionRate(new Pair(Currency.EUR, Currency.USD), new BigDecimal("1.0519"));
        bank.addConversionRate(new Pair(Currency.GBP, Currency.USD), new BigDecimal("1.2695"));        CurrencyPrinter currencyPrinter = new CurrencyPrinter(bank, csvReader);
        currencyPrinter.print();
    }
}

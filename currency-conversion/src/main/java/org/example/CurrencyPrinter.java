package org.example;

import java.math.BigDecimal;
import java.util.List;

public class CurrencyPrinter {

    private final Bank bank;
    private final CsvReader csvReader;

    public CurrencyPrinter(Bank bank, CsvReader csvReader) {
        this.bank = bank;
        this.csvReader = csvReader;
    }

    public void print() {
        System.out.println("----- Currency Conversion Results ----");
        for (ConversionRecord record : csvReader.records()) {
            Currency fromCurrency = Currency.valueOf(record.getSourceCurrency());
            Currency toCurrency = Currency.valueOf(record.getTargetCurrency());
            Money conversion = bank.convert(
                    new Money(new BigDecimal(Double.toString(record.getAmount())), fromCurrency),
                    new Pair(fromCurrency, toCurrency));
            System.out.printf("TransactionId: %d, %s to %s: %s%.2f%n",
                    record.getId(), fromCurrency, toCurrency, toCurrency.getSymbol(), conversion.amount());
        }
    }

}

package org.example;

import java.util.List;

public class CurrencyConverter {

    private static final double EXCHANGE_RATE = 0.75;



    public static void main(String[] args) {
        String csvFile = "src/main/resources/currencies.csv";
        CsvReader csvReader = new CsvReader();
        Bank bank = new Bank();
        List<ConversionRecord> records = csvReader.readCSV(csvFile);

        for (ConversionRecord record : records) {
            double convertedAmount = bank.convertCurrency(record.getAmount(), EXCHANGE_RATE);
            System.out.println(record.getId() + " - " + record.getSourceCurrency() + " to " + record.getTargetCurrency() + ": " + convertedAmount);
        }
    }

}

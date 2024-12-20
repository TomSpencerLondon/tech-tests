package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CurrencyConverter {

    private static final double EXCHANGE_RATE = 0.75;

    public static void main(String[] args) {
        String csvFile = "currencies.csv";

        List<ConversionRecord> records = readCSV(csvFile);

        for (ConversionRecord record : records) {
            double convertedAmount = convertCurrency(record.getAmount(), EXCHANGE_RATE);
            System.out.println(record.getId() + " - " + record.getSourceCurrency() + " to " + record.getTargetCurrency() + ": " + convertedAmount);
        }
    }

    public static List<ConversionRecord> readCSV(String fileName) {
        List<ConversionRecord> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                double amount = Double.parseDouble(values[1]);
                String sourceCurrency = values[2];
                String targetCurrency = values[3];

                records.add(new ConversionRecord(id, amount, sourceCurrency, targetCurrency));
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading file");
        } catch (NumberFormatException e) {
            throw new RuntimeException("Invalid format");
        }
        return records;
    }

    public static double convertCurrency(double amount, double rate) {
        return amount * rate;
    }
}

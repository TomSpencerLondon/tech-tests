package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CsvReader {
    private final String csvFile;
    private final Logger logger;

    public CsvReader(String csvFile, Logger logger) {
        this.csvFile = csvFile;
        this.logger = logger;
    }

    public List<ConversionRecord> records() {
        List<ConversionRecord> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] values = line.split(",");

                try {
                    int id = Integer.parseInt(values[0]);
                    double amount = Double.parseDouble(values[1]);
                    String sourceCurrency = values[2];
                    String targetCurrency = values[3];
                    records.add(new ConversionRecord(id, amount, sourceCurrency, targetCurrency));
                } catch (NumberFormatException e) {
                    String message = String.format("Incorrect currency format for line: %s", line);
                    logger.log(Level.WARNING, message);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading file");
        } catch (NumberFormatException e) {
            throw new RuntimeException("Invalid format");
        }
        return records;
    }
}

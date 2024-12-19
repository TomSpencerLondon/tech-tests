package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConversionService {

    public void processConversions(String csvFilePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                String[] tokens = line.split(",");
                int id = Integer.parseInt(tokens[0]);
                double miles = Double.parseDouble(tokens[1]);
                double kilometers = Converter.convertMilesToKilometers(miles);
                System.out.printf("ID: %d, Miles: %.2f, Kilometers: %.2f, Note: %s%n",
                        id, miles, kilometers, tokens[2]);
            }
        } catch (Exception e) {
            System.err.println("Error processing row.");
        }
    }
}


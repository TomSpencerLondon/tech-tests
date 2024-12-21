package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "Chocolate Bar,Food,1.00,0.0",
            "Book, Books, 12.49, 0.0",
            "Packet of Headache Pills,Medical,9.75,0.0",
            "Notebook,Books,2.50,0.0"
    })
    void calculatesTaxForBooksWithZeroRateGiven(String itemName, String category, double price, double taxRate) {
        TaxCalculator taxCalculator = new TaxCalculator();

        Item item = new Item(itemName, category, price, taxRate);

        double result = taxCalculator.calculateTax(item);

        assertEquals(0.0, result);
    }

    @ParameterizedTest
    @CsvSource({
            "Music CD,Other,14.99,0.1,1.50",
            "Imported Perfume,Other,47.50,0.15,7.13",
            "Bottle of Wine,Other,20.00,0.2,4.00",
            "Packet of Imported Chocolates,Food,11.25,0.05,0.56",
            "Smartphone,Electronics,199.99,0.2,40.00",
            "Pack of Stationery,Other,5.99,0.1,0.60"
    })
    void calculatesTaxForBooksWithRateGiven(String itemName, String category, double price, double taxRate, double expected) {
        TaxCalculator taxCalculator = new TaxCalculator();

        Item item = new Item(itemName, category, price, taxRate);

        double result = taxCalculator.calculateTax(item);

        assertEquals(expected, result);
    }
}

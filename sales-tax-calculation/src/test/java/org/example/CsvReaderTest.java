package org.example;

import org.example.repository.CsvReader;
import org.example.repository.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class CsvReaderTest {

    private CsvReader csvReader;
    Logger logger;

    @BeforeEach
    void setUp() {
        logger = mock(Logger.class);
        csvReader = new CsvReader(
                "src/test/resources/correct_test_input.csv",
                logger
        );
    }

    @Test
    void readsCorrectInput() {
        List<Item> items = csvReader.findAll();

        Item expected = new Item("Chocolate Bar", "Food", 1.00, 0.00);
        assertThat(items)
                .containsExactly(expected);
    }

    @Test
    void logsErrorForEmptyPriceValue() {
        csvReader = new CsvReader(
                "src/test/resources/missing_price_input.csv",
                logger
        );

        List<Item> items = csvReader.findAll();

        assertThat(items)
                .isEmpty();
        verify(logger, times(1))
                .log(Level.SEVERE, "Incorrect input for: Chocolate Bar,Food,,0.0");
    }

    @Test
    void logsErrorForEmptyTaxValue() {
        csvReader = new CsvReader(
                "src/test/resources/missing_tax_input.csv",
                logger
        );

        List<Item> items = csvReader.findAll();

        assertThat(items)
                .isEmpty();
        verify(logger, times(1))
                .log(Level.SEVERE, "Incorrect input for: Chocolate Bar,Food,1.0,");
    }
}

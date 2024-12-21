package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CsvReaderTest {

    @Test
    void readsCorrectInput() {

        List<Item> items = CsvReader.readItemsFromFile("src/test/resources/correct_test_input.csv");

        Item expected = new Item("Chocolate Bar", "Food", 1.00, 0.00);
        assertThat(items)
                .containsExactly(expected);
    }
}

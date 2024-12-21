package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CsvReaderTest {

    @Test
    void readsCorrectInput() {
        ItemRepository csvReader = new CsvReader("src/test/resources/correct_test_input.csv");
        List<Item> items = csvReader.findAll();

        Item expected = new Item("Chocolate Bar", "Food", 1.00, 0.00);
        assertThat(items)
                .containsExactly(expected);
    }


}

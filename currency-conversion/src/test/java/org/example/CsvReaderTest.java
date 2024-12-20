package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvReaderTest {

    @Mock
    Logger logger = mock(Logger.class);

    @Test
    void correctInputsAreAddedAsRecords() {
        CsvReader csvReader = new CsvReader("src/test/resources/valid_currencies.csv", logger);

        List<ConversionRecord> records = csvReader.records();

        assertEquals(1, records.get(0).getId());
        assertEquals(100, records.get(0).getAmount());
        assertEquals("USD", records.get(0).getSourceCurrency());
        assertEquals("EUR", records.get(0).getTargetCurrency());

        ConversionRecord first = new ConversionRecord(
                1, 100, "USD", "EUR");
        ConversionRecord second = new ConversionRecord(
                4, 0, "JPY", "USD");
        ConversionRecord third = new ConversionRecord(
                5, 150.75, "USD", "INR");
        ConversionRecord fourth = new ConversionRecord(
                8, 10.123456789, "EUR", "USD");
        ConversionRecord fifth = new ConversionRecord(
                9, 75, "GBP", "USD");


        assertThat(records).contains(first);
        assertThat(records).contains(second);
        assertThat(records).contains(third);
        assertThat(records).contains(fourth);
        assertThat(records).contains(fifth);

    }

    @Test
    void invalidNumericInputThrowsNumberFormatException() {
        CsvReader csvReader = new CsvReader("src/test/resources/invalid_number_format.csv", logger);
        ArgumentCaptor<String> logMessageCaptor = ArgumentCaptor.forClass(String.class);

        csvReader.records();

        verify(logger, times(1)).log(Level.WARNING,
                "Incorrect currency format for line: 2,abc,USD,EUR,Non-numeric amount");
    }
}

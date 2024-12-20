package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionRecordTest {
    @Test
    void createsConversionRecordWithCorrectCurrencies() {
        ConversionRecord conversionRecord = new ConversionRecord(1, 2.0, "USD", "GBP");

        assertEquals(conversionRecord.getSourceCurrency(), "USD");
        assertEquals(conversionRecord.getTargetCurrency(), "GBP");
    }
}

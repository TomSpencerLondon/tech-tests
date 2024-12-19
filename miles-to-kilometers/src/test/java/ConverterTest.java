import org.example.Converter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ConverterTest {
    @Test
    public void conversionWorksForMilesToKilometers() {
        double result = Converter.convertMilesToKilometers(1.0);
        assertEquals(1.61, result, 0.00);
    }

    @Test
    public void convertFifteenAndAHalfToKilometers() {
        double result = Converter.convertMilesToKilometers(15.5);
        assertEquals(24.94, result, 0.00);
    }

    @Test
    public void minusNumberThrowsException() {
        assertThrows(
                "Zero or negative number",
                IllegalArgumentException.class,
                () -> Converter.convertMilesToKilometers(-1.0));
    }
}

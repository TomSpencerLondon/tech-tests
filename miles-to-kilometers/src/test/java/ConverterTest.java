import org.example.Converter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    @Test
    public void conversionWorksForMilesToKilometers() {
        Converter converter = new Converter();

        double result = converter.convertMilesToKilometers(1.0);
        assertEquals(1.61, result, 0.00);
    }
}

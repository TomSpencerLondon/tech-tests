import org.example.Converter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    @Test
    public void nonNumericValueShouldBeSkippedAndLogged() {
//        conversion for miles to kilometers = 1.60934
        Converter converter = new Converter();

        double result = converter.convertMilesToKilometers(1.0);
        assertEquals(1.61, result, 0.01);
    }
}

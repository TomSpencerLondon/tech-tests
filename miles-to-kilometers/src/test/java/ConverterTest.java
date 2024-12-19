import org.example.Converter;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void nonNumericValueShouldBeSkippedAndLogged() {
//        conversion for miles to kilometers = 1.60934
        Converter converter = new Converter();

        double result = converter.convertMilesToKilometers(1.0);


    }
}

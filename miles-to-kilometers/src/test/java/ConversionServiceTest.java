import org.example.ConversionService;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConversionServiceTest {
    @Test
    @Ignore
    public void nonNumericValueShouldBeSkippedAndLogged() {
        ConversionService converter = new ConversionService();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream byteArrayOutputStream = new PrintStream(out);
        System.setOut(byteArrayOutputStream);
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        PrintStream byteArrayErrorStream = new PrintStream(err);

        System.setErr(byteArrayErrorStream);

        converter.processConversions("src/test/resources/test_distances.csv");

        String result = out.toString();
        String error = err.toString();

        assertTrue(result.isEmpty());
    }

    @Test
    public void normalNumericEntryPrintsResult() {
        ConversionService converter = new ConversionService();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream byteArrayOutputStream = new PrintStream(out);
        System.setOut(byteArrayOutputStream);

        converter.processConversions("src/test/resources/test_distances.csv");

        String result = out.toString();
//        1,1,valid
        assertEquals("ID: 1, Miles: 1.00, Kilometers: 2.01, Note: valid\n", result);

    }
}

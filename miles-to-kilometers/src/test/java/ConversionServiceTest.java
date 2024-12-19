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
    public void normalNumericEntryPrintsResult() {
        ConversionService converter = new ConversionService();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        PrintStream byteArrayOutputStream = new PrintStream(out);
        PrintStream byteArrayErrorStream = new PrintStream(err);
        System.setOut(byteArrayOutputStream);
        System.setErr(byteArrayErrorStream);

        converter.processConversions("src/test/resources/test_distances.csv");

        String result = out.toString();
        String error = err.toString();

        assertEquals("Error processing row.\n" +
                "Error processing row.\n" +
                "Error processing row.\n" +
                "Error processing row.\n" +
                "Error processing row.\n",
                error);

        assertEquals(
                "ID: 1, Miles: 10.00, Kilometers: 16.09, Note: valid\n" +
                "ID: 5, Miles: 15.50, Kilometers: 24.94, Note: Valid Entry\n" +
                "ID: 8, Miles: 8.12, Kilometers: 13.07, Note: Excessive precision\n" +
                "ID: 9, Miles: 5.00, Kilometers: 8.05, Note: Valid Entry\n",
                result);

    }
}

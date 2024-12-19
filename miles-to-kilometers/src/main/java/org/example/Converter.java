package org.example;

public class Converter {
    private static final double CONVERSION_FACTOR = 1.60934;

    public static double convertMilesToKilometers(double miles) {
        if (miles <= 0 || miles > 1_000_000) {
            throw new IllegalArgumentException("Zero, negative or excessively large number");
        }

        double result = miles * CONVERSION_FACTOR;

        return Math.round(result * 100.0) / 100.0;
    }
}

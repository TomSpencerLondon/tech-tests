package org.example;

public class Converter {
    private static final double CONVERSION_FACTOR = 1.60934;

    public static double convertMilesToKilometers(double miles) {
        if (miles <= 0) {
            throw new IllegalArgumentException("Zero or negative number");
        }

        if (miles > 1_000_000) {
            return Double.POSITIVE_INFINITY;
        }

        double result = miles * CONVERSION_FACTOR;

        return Math.round(result * 100.0) / 100.0;
    }
}

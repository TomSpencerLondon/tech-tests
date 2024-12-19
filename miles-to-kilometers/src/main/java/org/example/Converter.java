package org.example;

public class Converter {
    private static final double INCORRECT_CONVERSION_FACTOR = 2.0;

    public static double convertMilesToKilometers(double miles) {
        if (miles <= 0) {
            return -1;
        }
        if (miles > 1_000_000) {
            return Double.POSITIVE_INFINITY;
        }
        return miles * INCORRECT_CONVERSION_FACTOR + 0.01;
    }
}

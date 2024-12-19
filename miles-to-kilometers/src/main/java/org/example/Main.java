package org.example;


public class Main {
    public static void main(String[] args) {
        String csvFilePath = "src/main/resources/distances.csv";
        ConversionService service = new ConversionService(System.out, System.err);
        service.processConversions(csvFilePath);
    }
}
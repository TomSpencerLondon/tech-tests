package org.example;

import org.example.repository.CsvReader;
import org.example.repository.Item;
import org.example.repository.ItemRepository;

import java.util.*;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        String fileName = "src/main/resources/input.csv";
        Logger logger = Logger.getLogger(CsvReader.class.getName());
        ItemRepository csvReader = new CsvReader(fileName, logger);
        List<Item> items = csvReader.findAll();
        Checkout checkout = new Checkout(items);
        checkout.process();
        Printer printer = new Printer(checkout);
        printer.print();
    }

}

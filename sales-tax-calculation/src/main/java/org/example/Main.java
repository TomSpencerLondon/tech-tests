package org.example;

import org.example.repository.CsvReader;
import org.example.repository.Item;
import org.example.repository.ItemRepository;

import java.util.*;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        String file = Objects.requireNonNull(Main.class.getClassLoader().getResource("input.csv")).getFile();
        Logger logger = Logger.getLogger(CsvReader.class.getName());
        ItemRepository csvReader = new CsvReader(file, logger);
        List<Item> items = csvReader.findAll();
        Checkout checkout = new Checkout(items, new Printer());
        checkout.process();
        checkout.print();
    }
}

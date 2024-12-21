package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader implements ItemRepository {

    private final String fileName;

    public CsvReader(String fileName) {
        this.fileName = fileName;
    }

     @Override
     public List<Item> findAll() {
        List<Item> items = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String category = parts[1];
                double price = Double.parseDouble(parts[2]);
                double taxRate = Double.parseDouble(parts[3]);
                items.add(new Item(name, category, price, taxRate));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return items;
    }
}

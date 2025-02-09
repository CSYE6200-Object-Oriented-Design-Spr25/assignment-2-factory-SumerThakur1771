/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

import java.io.IOException;

/**
 *
 * @author sumer
 */
public class Store extends AbstractStore{
 @Override
    public void demo() {
        try {
            // Load Food Items
            for (String line : FileUtil.readFile("FoodItemCSV.txt")) {
                items.add(FoodItemFactory.createItem(line));
            }

            // Load Electronic Items
            for (String line : FileUtil.readFile("ElectronicItemCSV.txt")) {
                items.add(ElectronicItemFactory.getInstance().createItem(line));
            }

            // Load Service Items
            for (String line : FileUtil.readFile("ServiceItemCSV.txt")) {
                items.add(ServiceItemFactory.getInstance().createItem(line));
            }

            // Print Items
            System.out.println("Items Loaded:");
            items.forEach(System.out::println);

            System.out.println("\nSorted by ID:");
            sortById();
            items.forEach(System.out::println);

            System.out.println("\nSorted by Name:");
            sortByName();
            items.forEach(System.out::println);

            System.out.println("\nSorted by Price:");
            sortByPrice();
            items.forEach(System.out::println);

        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }
}

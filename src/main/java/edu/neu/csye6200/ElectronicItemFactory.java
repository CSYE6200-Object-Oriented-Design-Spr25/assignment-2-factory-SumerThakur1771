/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author sumer
 */
public class ElectronicItemFactory {
     private static ElectronicItemFactory instance;

    private ElectronicItemFactory() {}

    public static ElectronicItemFactory getInstance() {
        if (instance == null) {
            instance = new ElectronicItemFactory();
        }
        return instance;
    }

    public ElectronicItem createItem(String csv) {
        String[] data = csv.split(",");
        return new ElectronicItem(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]));
    }
}

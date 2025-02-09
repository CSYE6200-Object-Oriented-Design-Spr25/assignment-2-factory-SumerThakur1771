/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author sumer
 */
public class ServiceItemFactory {
    private static final ServiceItemFactory instance = new ServiceItemFactory();

    private ServiceItemFactory() {}

    public static ServiceItemFactory getInstance() {
        return instance;
    }

    public ServiceItem createItem(String csv) {
        String[] data = csv.split(",");
        return new ServiceItem(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]));
    }
}

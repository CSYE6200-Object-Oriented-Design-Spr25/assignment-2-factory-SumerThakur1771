/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author sumer
 */
public class ServiceItem extends Item{
    public ServiceItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return "ServiceItem [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}

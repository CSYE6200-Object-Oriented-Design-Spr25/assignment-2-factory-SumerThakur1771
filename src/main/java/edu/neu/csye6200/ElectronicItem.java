/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author sumer
 */
public class ElectronicItem extends Item{
    public ElectronicItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return "ElectronicItem [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}

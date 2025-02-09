/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author sumer
 */
public class FoodItem extends Item {
    public FoodItem(int id, String name, double price) {
        super(id, name, price);
    }

    // ✅ Add a default constructor if needed
    public FoodItem() {
        super(0, "Unknown", 0.0);
    }

    @Override
    public String toString() {
        return "FoodItem [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}

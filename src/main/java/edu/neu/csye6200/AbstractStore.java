/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

import java.util.*;

/**
 *
 * @author sumer
 */
abstract class AbstractStore {
    protected List<Item> items = new ArrayList<>();

    public abstract void demo();

    public void sortById() {
        items.sort(Comparator.comparingInt(i -> i.id));
    }

    public void sortByName() {
        items.sort(Comparator.comparing(i -> i.name));
    }

    public void sortByPrice() {
        items.sort(Comparator.comparingDouble(i -> i.price));
    }
}

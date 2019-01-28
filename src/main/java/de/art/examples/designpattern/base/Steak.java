package de.art.examples.designpattern.base;

import de.art.examples.designpattern.Dish;

public class Steak implements Dish {
    public float getPrice() {
        return 12.99f;
    }

    public void printDescription() {
        System.out.println("Steak");
    }
}

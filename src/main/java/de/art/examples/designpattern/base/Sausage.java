package de.art.examples.designpattern.base;

import de.art.examples.designpattern.Dish;

public class Sausage implements Dish {
    public float getPrice() {
        return 3.99f;
    }

    public void printDescription() {
        System.out.println("Sausage");
    }
}

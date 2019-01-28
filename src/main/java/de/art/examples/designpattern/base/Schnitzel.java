package de.art.examples.designpattern.base;

import de.art.examples.designpattern.Dish;

public class Schnitzel implements Dish {
    public float getPrice() {
        return 7.50f;
    }

    public void printDescription() {
        System.out.println("Schnitzel");
    }
}

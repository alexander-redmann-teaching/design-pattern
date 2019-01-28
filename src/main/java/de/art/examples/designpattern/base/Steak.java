package de.art.examples.designpattern.base;

import de.art.examples.designpattern.DishComponent;

public class Steak implements DishComponent {
    public float getPrice() {
        return 12.99f;
    }

    public void printDescription() {
        System.out.println("Steak");
    }
}

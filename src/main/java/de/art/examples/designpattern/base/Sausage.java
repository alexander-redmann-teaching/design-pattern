package de.art.examples.designpattern.base;

import de.art.examples.designpattern.DishComponent;

public class Sausage implements DishComponent {
    public float getPrice() {
        return 3.99f;
    }

    public void printDescription() {
        System.out.println("Sausage");
    }
}

package de.art.examples.designpattern.base;

import de.art.examples.designpattern.DishComponent;

public class Schnitzel implements DishComponent {
    public float getPrice() {
        return 7.50f;
    }

    public void printDescription() {
        System.out.println("Schnitzel");
    }
}

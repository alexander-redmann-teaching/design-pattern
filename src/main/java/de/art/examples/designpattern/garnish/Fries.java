package de.art.examples.designpattern.garnish;

import de.art.examples.designpattern.DishComponent;

public class Fries extends GarnishDecorator {
    public Fries(DishComponent dish) {
        super(dish);
    }

    public float getPrice() {
        return dish.getPrice() + 1.99f;
    }

    public void printDescription() {
        dish.printDescription();
        System.out.println("Fries");
    }
}

package de.art.examples.designpattern.garnish;

import de.art.examples.designpattern.Dish;

public class Noodles extends GarnishDecorator {
    public Noodles(Dish dish) {
        super(dish);
    }

    public float getPrice() {
        return dish.getPrice() + 0.99f;
    }

    public void printDescription() {
        dish.printDescription();
        System.out.println("Noodles");
    }
}

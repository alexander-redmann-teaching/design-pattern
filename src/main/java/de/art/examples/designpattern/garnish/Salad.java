package de.art.examples.designpattern.garnish;

import de.art.examples.designpattern.DishComponent;

public class Salad extends GarnishDecorator {
    public Salad(DishComponent dish) {
        super(dish);
    }

    public float getPrice() {
        return dish.getPrice() + 2.99f;
    }

    public void printDescription() {
        dish.printDescription();
        System.out.println("Salad");
    }
}

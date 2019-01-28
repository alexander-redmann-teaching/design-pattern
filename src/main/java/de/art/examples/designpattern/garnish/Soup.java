package de.art.examples.designpattern.garnish;

import de.art.examples.designpattern.DishComponent;

public class Soup extends GarnishDecorator {
    public Soup(DishComponent dish) {
        super(dish);
    }

    public float getPrice() {
        return dish.getPrice() + 3.99f;
    }

    public void printDescription() {
        dish.printDescription();
        System.out.println("Soup");
    }
}

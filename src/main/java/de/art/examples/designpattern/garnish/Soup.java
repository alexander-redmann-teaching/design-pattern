package de.art.examples.designpattern.garnish;

import de.art.examples.designpattern.Dish;

public class Soup extends GarnishDecorator {
    public Soup(Dish dish) {
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

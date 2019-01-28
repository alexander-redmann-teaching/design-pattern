package de.art.examples.designpattern.garnish;

import de.art.examples.designpattern.Dish;

public abstract class GarnishDecorator implements Dish {
    protected final Dish dish;


    protected GarnishDecorator(Dish dish) {
        this.dish = dish;
    }
}

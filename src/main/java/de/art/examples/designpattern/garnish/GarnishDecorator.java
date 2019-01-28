package de.art.examples.designpattern.garnish;

import de.art.examples.designpattern.DishComponent;

public abstract class GarnishDecorator implements DishComponent {
    protected final DishComponent dish;


    protected GarnishDecorator(DishComponent dish) {
        this.dish = dish;
    }
}

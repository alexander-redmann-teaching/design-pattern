package de.art.examples.designpattern;

import de.art.examples.designpattern.base.Steak;
import de.art.examples.designpattern.garnish.Noodles;
import de.art.examples.designpattern.garnish.Salad;
import de.art.examples.designpattern.garnish.Soup;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        DishComponent dish = new Salad(new Noodles(new Steak()));
        dish.printDescription();
        System.out.println(" for "+ dish.getPrice() +" €");

        dish = new Soup(dish);
        dish.printDescription();
        System.out.println(" for "+ dish.getPrice() +" €");

    }
}

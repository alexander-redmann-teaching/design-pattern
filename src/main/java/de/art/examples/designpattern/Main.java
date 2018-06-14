package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Eagle...");
        final Eagle eagle = new Eagle();
        eagle.fly();
        eagle.makeSound();

        System.out.println("\nToyDuck...");
        final PlasticToyDuck plasticToyDuck = new PlasticToyDuck();
        plasticToyDuck.squeak();

        System.out.println("\nToyAdapter...");
        final ToyAdapter toyAdapter = new ToyAdapter(plasticToyDuck);
        toyAdapter.fly();
        toyAdapter.makeSound();
    }
}

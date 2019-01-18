package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        final AnimalBuilderInterface animalBuilder = new AnimalBuilderInterfaceImpl();
        final AnimalDirector animalDirector = new AnimalDirector(animalBuilder);
        System.out.println(animalDirector.construct());
    }
}

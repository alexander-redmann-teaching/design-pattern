package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        final AnimalBuilderInterface animalBuilder = new AnimalBuilderInterfaceImpl();
        final AnimalBuildDirector animalBuildDirector = new AnimalBuildDirector(animalBuilder);
        System.out.println(animalBuildDirector.construct());
    }
}

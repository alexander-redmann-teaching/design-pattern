package de.art.examples.designpattern;

import de.art.examples.designpattern.factory.AbstractAnimalFactory;
import de.art.examples.designpattern.factory.ElephantFactory;
import de.art.examples.designpattern.factory.TigerFactory;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Tiger");
        AbstractAnimalFactory animalFactory = new TigerFactory();
        EnvironmentClient environmentClient = new EnvironmentClient(animalFactory);
        environmentClient.createEnvironment();

        System.out.println("Elephant");
        animalFactory = new ElephantFactory();
        environmentClient = new EnvironmentClient(animalFactory);
        environmentClient.createEnvironment();
    }
}

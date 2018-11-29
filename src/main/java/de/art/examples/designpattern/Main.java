package de.art.examples.designpattern;

import de.art.examples.designpattern.factory.TigerFactory;
import de.art.examples.designpattern.factory.ElephantFactory;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Tiger");
        new EnvironmentClient(new TigerFactory()).createEnvironment();
        System.out.println("Elephant");
        new EnvironmentClient(new ElephantFactory()).createEnvironment();
    }
}

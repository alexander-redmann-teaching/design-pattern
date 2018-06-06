package de.art.examples.designpattern;

import de.art.examples.designpattern.factory.JungleFactory;
import de.art.examples.designpattern.factory.SavannaFactory;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Jungle");
        new Client(new JungleFactory()).createEnvironment();
        System.out.println("Savanna");
        new Client(new SavannaFactory()).createEnvironment();
    }
}

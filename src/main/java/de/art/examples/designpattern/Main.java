package de.art.examples.designpattern;

import de.art.examples.designpattern.factory.JungleFactory;
import de.art.examples.designpattern.factory.SavannaFactory;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Jungle");
        Client client = new Client(new JungleFactory());
        client.createEnvironment();
        System.out.println("Savanna");
        client = new Client(new SavannaFactory());
        client.createEnvironment();
    }
}

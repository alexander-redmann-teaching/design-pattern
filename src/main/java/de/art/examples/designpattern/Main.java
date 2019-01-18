package de.art.examples.designpattern;

import de.art.examples.designpattern.factory.AbstractEnvironmentFactory;
import de.art.examples.designpattern.factory.JungleFactory;
import de.art.examples.designpattern.factory.SavannaFactory;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Jungle");
        AbstractEnvironmentFactory abstractEnvironmentFactory = new JungleFactory();
        Client client = new Client(abstractEnvironmentFactory);
        client.createEnvironment();

        System.out.println("Savanna");
        abstractEnvironmentFactory = new SavannaFactory();
        client = new Client(abstractEnvironmentFactory);
        client.createEnvironment();
    }
}

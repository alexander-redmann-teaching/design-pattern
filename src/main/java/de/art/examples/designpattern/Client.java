package de.art.examples.designpattern;

import de.art.examples.designpattern.factory.AbstractEnvironmentFactory;

public class Client {
    private final AbstractEnvironmentFactory environmentFactory;

    public Client(AbstractEnvironmentFactory environmentFactory) {
        this.environmentFactory = environmentFactory;
    }

    public void createEnvironment() {
        System.out.println("Environment sound: " + environmentFactory.getAnimal().getSound());
        System.out.println("Environment color: " + environmentFactory.getPlant().getColor());
    }
}

package de.art.examples.designpattern;

import de.art.examples.designpattern.factory.AbstractAnimalFactory;

public class Client {
    private final AbstractAnimalFactory environmentFactory;

    public Client(AbstractAnimalFactory environmentFactory) {
        this.environmentFactory = environmentFactory;
    }

    public void createEnvironment() {
        System.out.println("Animal sound: " + environmentFactory.createAnimal().getSound());
    }
}

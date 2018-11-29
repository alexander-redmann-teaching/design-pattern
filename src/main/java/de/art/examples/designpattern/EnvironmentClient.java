package de.art.examples.designpattern;

import de.art.examples.designpattern.factory.AbstractAnimalFactory;

public class EnvironmentClient {
    private final AbstractAnimalFactory animalFactory;

    public EnvironmentClient(AbstractAnimalFactory animalFactory) {
        this.animalFactory = animalFactory;
    }

    public void createEnvironment() {
        System.out.println("Animal sound: " + animalFactory.createAnimal().getSound());
    }
}

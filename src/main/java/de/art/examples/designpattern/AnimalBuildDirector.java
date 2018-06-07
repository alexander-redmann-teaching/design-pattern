package de.art.examples.designpattern;

public class AnimalBuildDirector {
    private final AnimalBuilderInterface animalBuilderInterface;

    public AnimalBuildDirector(AnimalBuilderInterface animalBuilderInterface) {
        this.animalBuilderInterface = animalBuilderInterface;
    }

    public Animal construct() {
        return animalBuilderInterface.setColor("grey").setLimbs(4).setName("Elephant").build();
    }
}

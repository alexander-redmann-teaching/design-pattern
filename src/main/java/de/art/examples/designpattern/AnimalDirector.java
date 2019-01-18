package de.art.examples.designpattern;

public class AnimalDirector {
    private final AnimalBuilderInterface animalBuilderInterface;

    public AnimalDirector(AnimalBuilderInterface animalBuilderInterface) {
        this.animalBuilderInterface = animalBuilderInterface;
    }

    public Animal construct() {
        return animalBuilderInterface.setColor("grey").setLimbs(4).setName("Elephant").build();
    }
}

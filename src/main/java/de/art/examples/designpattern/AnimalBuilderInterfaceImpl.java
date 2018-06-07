package de.art.examples.designpattern;

public class AnimalBuilderInterfaceImpl implements AnimalBuilderInterface {
    private String color;
    private int limbs;
    private String name;

    public Animal build() {
        return new Animal(color, limbs, name);
    }

    public AnimalBuilderInterface setColor(String color) {
        this.color = color;
        return this;
    }

    public AnimalBuilderInterface setLimbs(int limbs) {
        this.limbs = limbs;
        return this;
    }

    public AnimalBuilderInterface setName(String name) {
        this.name = name;
        return this;
    }
}

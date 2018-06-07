package de.art.examples.designpattern;

public interface AnimalBuilderInterface {
    Animal build();

    AnimalBuilderInterface setColor(String color);

    AnimalBuilderInterface setLimbs(int limbs);

    AnimalBuilderInterface setName(String name);
}

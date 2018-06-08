package de.art.examples.designpattern;

import java.util.Stack;

public class ZooPool {
    private final Stack<Animal> instances = new Stack<Animal>();

    public void pushAnimal(Animal animal) {
        instances.push(animal);
    }

    public Animal popAnimal() {
        return instances.pop();
    }
}

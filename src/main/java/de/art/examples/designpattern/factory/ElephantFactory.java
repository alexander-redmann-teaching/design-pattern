package de.art.examples.designpattern.factory;

import de.art.examples.designpattern.product.Animal;
import de.art.examples.designpattern.product.Elephant;

public class ElephantFactory extends AbstractAnimalFactory {
    public Animal createAnimal() {
        return new Elephant();
    }
}

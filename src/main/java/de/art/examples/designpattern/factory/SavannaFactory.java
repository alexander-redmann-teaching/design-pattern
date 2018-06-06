package de.art.examples.designpattern.factory;

import de.art.examples.designpattern.product.animal.Animal;
import de.art.examples.designpattern.product.animal.Elephant;
import de.art.examples.designpattern.product.plant.Marula;
import de.art.examples.designpattern.product.plant.Plant;

public class SavannaFactory extends AbstractEnvironmentFactory {
    public Animal getAnimal() {
        return new Elephant();
    }

    public Plant getPlant() {
        return new Marula();
    }
}

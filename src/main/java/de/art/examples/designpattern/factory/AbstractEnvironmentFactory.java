package de.art.examples.designpattern.factory;

import de.art.examples.designpattern.product.animal.Animal;
import de.art.examples.designpattern.product.plant.Plant;

public abstract class AbstractEnvironmentFactory {
    public abstract Animal getAnimal();

    public abstract Plant getPlant();
}

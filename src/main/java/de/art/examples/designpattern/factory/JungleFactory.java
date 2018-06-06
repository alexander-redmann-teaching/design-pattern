package de.art.examples.designpattern.factory;

import de.art.examples.designpattern.product.animal.Animal;
import de.art.examples.designpattern.product.animal.Tiger;
import de.art.examples.designpattern.product.plant.Orchid;
import de.art.examples.designpattern.product.plant.Plant;

public class JungleFactory extends AbstractEnvironmentFactory {
    public Animal getAnimal() {
        return new Tiger();
    }

    public Plant getPlant() {
        return new Orchid();
    }
}

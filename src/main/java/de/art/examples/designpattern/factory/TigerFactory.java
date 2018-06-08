package de.art.examples.designpattern.factory;

import de.art.examples.designpattern.product.Animal;
import de.art.examples.designpattern.product.Tiger;

public class TigerFactory extends AbstractAnimalFactory {
    public Animal createAnimal() {
        return new Tiger();
    }
}

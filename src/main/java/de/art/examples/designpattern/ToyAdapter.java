package de.art.examples.designpattern;

public class ToyAdapter implements Bird {
    private final ToyDuck toyDuck;

    public ToyAdapter(ToyDuck toyDuck) {
        this.toyDuck = toyDuck;
    }

    public void fly() {
        System.out.println("Throw away");
    }

    public void makeSound() {
        toyDuck.squeak();
    }
}

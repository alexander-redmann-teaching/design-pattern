package de.art.examples.designpattern;

public class ContainerDecorator extends Decorator {
    public void draw() {
        System.out.println("ContainerDecorator draw");
        super.draw();
    }
}

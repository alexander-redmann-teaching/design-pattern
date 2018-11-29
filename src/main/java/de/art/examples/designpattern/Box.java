package de.art.examples.designpattern;

public class Box extends Decorator {
    public void draw() {
        System.out.println("Box up line draw");
        super.draw();
        System.out.println("Box bottom line draw");
    }
}

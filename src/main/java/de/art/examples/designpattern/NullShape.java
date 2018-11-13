package de.art.examples.designpattern;

public class NullShape implements Shape {
    public void draw() {
        System.out.println("Null object can't be draw");
    }

    public double getArea() {
        return 0;
    }
}

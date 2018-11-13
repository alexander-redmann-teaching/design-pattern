package de.art.examples.designpattern;

public class Rectangle implements Shape {
    private final double width;
    private final double length;

    public Rectangle() {
        this(1.0d, 1.0d);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public void draw() {
        System.out.println("Drawing Rectangle with area: " + getArea());
    }

    public double getArea() {
        return width * length;
    }
}

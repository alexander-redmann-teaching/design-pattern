package de.art.examples.designpattern;

public class Circle implements Shape {
    private final double radius;

    public Circle() {
        this(1.0d);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        // Area = π r^2
        return Math.PI * Math.pow(radius, 2);
    }

    public void draw() {
        System.out.println("Drawing Circle with area: " + getArea());
    }
}

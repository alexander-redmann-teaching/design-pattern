package de.art.examples.designpattern;

public class Node implements Shape {
    public Shape[] getShapeList() {
        return shapeList;
    }

    private final Shape[] shapeList;

    public Node(Shape[] shapeList) {
        this.shapeList = shapeList;
    }

    public void draw() {
        System.out.println("Drawing node with area: " + getArea());
        for (Shape shape : shapeList) {
            shape.draw();
        }
    }

    public double getArea() {
        double area = 0.0;
        for (Shape shape : shapeList) {
            area += shape.getArea();
        }
        return area;
    }
}

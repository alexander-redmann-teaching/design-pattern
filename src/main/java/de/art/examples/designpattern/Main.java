package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {


    public static void main(String[] args) {
        Shape[] node = {new Circle(), new Circle(), new Rectangle()};
        draw(node);
        System.out.println("----");
        node[1] = new NullShape();
        draw(node);
    }

    private static void draw(Shape[] node) {
        for (Shape shape : node) {
            shape.draw();
        }
    }


}

package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {


    public static void main(String[] args) {
        Node rootNode = new Node(new Shape[]{new NullShape(), new NullShape(), new NullShape()});
        rootNode.draw();
        System.out.println("----");
        rootNode.getShapeList()[0] = new Circle();
        rootNode.getShapeList()[2] = new Rectangle();
        rootNode.draw();
        System.out.println("----");
        Node subNode = new Node(new Shape[]{new Rectangle(), new Circle(), new Rectangle()});
        rootNode.getShapeList()[1] = subNode;
        rootNode.draw();
    }


}

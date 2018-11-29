package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        Decorator decorator = new ContainerDecorator();
        Decorator innerDecorator = new Box();

        decorator.add(new Ellipse());
        decorator.add(innerDecorator);

        innerDecorator.add(new Rectangle());

        decorator.draw();
    }
}

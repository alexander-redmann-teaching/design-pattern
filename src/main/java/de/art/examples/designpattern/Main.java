package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        Component component = new Container();
        Component innerComponent = new Box();

        component.add(new Ellipse());
        component.add(innerComponent);

        innerComponent.add(new Rectangle());

        component.draw();
    }
}

package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        ContainerComposite component = new ContainerComposite();
        ContainerComposite innerComponent = new ContainerComposite();

        component.add(new Ellipse());
        component.add(innerComponent);

        innerComponent.add(new Rectangle());
        innerComponent.add(new Ellipse());
        innerComponent.add(new Rectangle());

        component.draw();
    }
}

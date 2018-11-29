package de.art.examples.designpattern;

import java.util.LinkedList;
import java.util.List;

public abstract class Decorator implements GraphicsComponent {
    private List<GraphicsComponent> graphicsComponentList = new LinkedList<GraphicsComponent>();

    public void add(GraphicsComponent graphicsComponent) {
        graphicsComponentList.add(graphicsComponent);
    }


    public void draw() {
        for (GraphicsComponent graphicsComponent : graphicsComponentList) {
            graphicsComponent.draw();
        }
    }
}

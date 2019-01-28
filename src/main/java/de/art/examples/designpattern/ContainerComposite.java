package de.art.examples.designpattern;

import java.util.LinkedList;
import java.util.List;

public class ContainerComposite implements GraphicsComponent {
    private List<GraphicsComponent> graphicsList = new LinkedList<GraphicsComponent>();


    public void add(GraphicsComponent graphics) {
        graphicsList.add(graphics);
    }

    public void remove(GraphicsComponent graphics) {
        graphicsList.remove(graphics);
    }

    public GraphicsComponent get(int index) {
        return graphicsList.get(index);
    }

    public void draw() {
        System.out.println("ContainerComposite");
        for (GraphicsComponent graphics : graphicsList) {
            graphics.draw();
        }
    }
}

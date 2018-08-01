package de.art.examples.designpattern;

import java.util.LinkedList;
import java.util.List;

public abstract class Component implements Graphics {
    private List<Graphics> graphicsList = new LinkedList<Graphics>();


    public void add(Graphics graphics) {
        graphicsList.add(graphics);
    }

    public void remove(Graphics graphics) {
        graphicsList.remove(graphics);
    }

    public Graphics get(int index) {
        return graphicsList.get(index);
    }

    public void draw() {
        for (Graphics graphics : graphicsList) {
            graphics.draw();
        }
    }
}

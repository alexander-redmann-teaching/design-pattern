package de.art.examples.designpattern;

import java.util.Observable;
import java.util.Observer;

public class Printer implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println("Printer: " + ((DataStore) o).getData());
    }
}

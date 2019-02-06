package de.art.examples.designpattern;

import java.util.Observable;

public class DataStore extends Observable {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        setChanged();
        notifyObservers();
    }
}

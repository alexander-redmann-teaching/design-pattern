package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {


    public static void main(String[] args) {
        Screen screen = new Screen();
        Printer printer = new Printer();
        DataStore dataStore = new DataStore();
        dataStore.addObserver(screen);
        dataStore.addObserver(printer);

        dataStore.setData("Foo Bar");
        System.out.println("-------");
        dataStore.setData("Hello World");

    }
}

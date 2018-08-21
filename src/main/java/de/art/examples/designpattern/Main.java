package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < 100; i++) {
            forest.plantTree((int) (Math.random() * 500), (int) (Math.random() * 500),
                    "Oak", "green", "Oak texture");
            forest.plantTree((int) (Math.random() * 500), (int) (Math.random() * 500),
                    "Maple", "red", "Maple texture");
        }
        forest.draw();
    }
}

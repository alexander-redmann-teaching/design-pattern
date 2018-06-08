package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        final Animal tiger = Animal.getInstance();
        tiger.setColor("Orange");
        tiger.setLimbs(4);
        tiger.setSound("Roar");
        tiger.setMammal(true);
        tiger.setName("Tiger");

        final Animal ape = Animal.getInstance();
        ape.setName("Ape");
        System.out.println("Ape: " + ape);
        System.out.println("Tiger: " + tiger);
    }
}

package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        final Animal tiger = Animal.getInstance("tiger");
        tiger.setName("Tiger");
        tiger.setColor("Orange");
        tiger.setLimbs(4);
        tiger.setSound("Roar");
        tiger.setMammal(true);

        final Animal ape = Animal.getInstance("ape");
        ape.setName("Ape");
        ape.setColor("brown");
        ape.setLimbs(4);
        ape.setSound("Uhuh");
        ape.setMammal(true);

        System.out.println("Ape: " + Animal.getInstance("ape"));
        System.out.println("Tiger: " + Animal.getInstance("tiger"));
    }
}

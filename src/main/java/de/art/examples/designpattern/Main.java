package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        final Tiger tiger = new Tiger();
        tiger.setColor("Orange");
        tiger.setLimbs(4);
        tiger.setSound("Roar");
        tiger.setMammal(true);
        tiger.setName("Lilly");

        final Tiger clone = (Tiger) tiger.clone();
        clone.setName("Khan");
        System.out.println("Clone:\t" + clone);
        System.out.println("Proto:\t" + tiger);
    }
}

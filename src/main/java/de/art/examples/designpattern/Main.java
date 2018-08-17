package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();

        System.out.println(facade.getCrazyStuff1() + " " + facade.getCrazyStuff2());
    }
}

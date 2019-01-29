package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        DialogFacade dialogFacade = new DialogFacade();
        boolean erase = dialogFacade.showPanel("Erase HDD?");

    }
}

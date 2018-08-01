package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        TV sony = new Sony();
        ConcreteRemote concreteRemote = new ConcreteRemote(sony);

        concreteRemote.on();
        concreteRemote.setChannel(5);
        concreteRemote.nextChannel();
        concreteRemote.off();
    }
}

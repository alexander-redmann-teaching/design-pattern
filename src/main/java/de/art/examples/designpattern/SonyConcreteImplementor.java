package de.art.examples.designpattern;

public class SonyConcreteImplementor implements TVImplementor {
    public void on() {
        System.out.println("Sony specific on");
    }

    public void off() {
        System.out.println("Sony specific off");
    }

    public void tuneChannel(int channel) {
        System.out.println("Sony specific tuneChannel: " + channel);
    }
}
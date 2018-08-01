package de.art.examples.designpattern;

public class Samsung implements TV {
    public void on() {
        System.out.println("Samsung specific on");
    }

    public void off() {
        System.out.println("Samsung specific off");
    }

    public void tuneChannel(int channel) {
        System.out.println("Samsung specific tuneChannel");
    }
}
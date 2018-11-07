package de.art.examples.designpattern;

public class CeilingFanPullChainClassic {
    private int currentState = 0;

    public void pull() {
        if (currentState == 0) {
            currentState = 1;
            System.out.println("low speed");
        } else if (currentState == 1) {
            currentState = 2;
            System.out.println("medium speed");
        } else if (currentState == 2) {
            currentState = 3;
            System.out.println("high speed");
        } else {
            currentState = 0;
            System.out.println("turning off");
        }
    }
}

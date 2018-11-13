package de.art.examples.designpattern;

public class Taxi implements Element {
    private final long travelDuration;

    public Taxi(long travelDuration) {
        this.travelDuration = travelDuration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public long getTravelDuration() {
        return travelDuration;
    }
}

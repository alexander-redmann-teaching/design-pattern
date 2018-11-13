package de.art.examples.designpattern;

public class Airplane implements Element {
    private final long startTime;
    private final long landingTime;
    private final long checkInDuration;
    private final long checkOutDuration;

    public Airplane(long startTime, long landingTime, long checkInDuration, long checkOutDuration) {
        this.startTime = startTime;
        this.landingTime = landingTime;
        this.checkInDuration = checkInDuration;
        this.checkOutDuration = checkOutDuration;
    }


    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public long getStartTime() {
        return startTime;
    }

    public long getLandingTime() {
        return landingTime;
    }

    public long getCheckInDuration() {
        return checkInDuration;
    }

    public long getCheckOutDuration() {
        return checkOutDuration;
    }
}

package de.art.examples.designpattern;

public class Train implements Element {
    private final long startTime;
    private final long estimatedArrivalTime;
    private final long delay;

    public Train(long startTime, long estimatedArrivalTime, long delay) {
        this.startTime = startTime;
        this.estimatedArrivalTime = estimatedArrivalTime;
        this.delay = delay;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEstimatedArrivalTime() {
        return estimatedArrivalTime;
    }

    public long getDelay() {
        return delay;
    }
}

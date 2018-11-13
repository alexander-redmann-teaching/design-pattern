package de.art.examples.designpattern;

public class TravelTimeVisitor implements Visitor {
    private long travelTime = 0;

    public void visit(Airplane airplane) {
        travelTime += (airplane.getLandingTime() - airplane.getStartTime());
        travelTime += airplane.getCheckInDuration();
        travelTime += airplane.getCheckOutDuration();
    }

    public void visit(Taxi taxi) {
        travelTime += taxi.getTravelDuration();
    }

    public void visit(Train train) {
        travelTime += (train.getEstimatedArrivalTime() - train.getStartTime()) + train.getDelay();
    }

    public long getTravelTime() {
        return travelTime / 60;
    }
}

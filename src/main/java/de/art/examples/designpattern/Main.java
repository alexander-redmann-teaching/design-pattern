package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {


    public static void main(String[] args) {
        Taxi taxiFromHomeToTrainStation = new Taxi(minToSeconds(10));
        Train trainToAirport = new Train(timeToSeconds(1050), timeToSeconds(1130), minToSeconds(5));
        Airplane airplane = new Airplane(timeToSeconds(1200), timeToSeconds(1400), minToSeconds(20), minToSeconds(5));
        Taxi taxiFromAirportToHotel = new Taxi(minToSeconds(15));

        Element[] elements = {taxiFromHomeToTrainStation, trainToAirport, airplane, taxiFromAirportToHotel};

        TravelTimeVisitor visitor = new TravelTimeVisitor();
        for (Element element : elements) {
            element.accept(visitor);
        }

        System.out.println("Total travel time in minutes: " + visitor.getTravelTime());
    }

    private static long minToSeconds(long minute) {
        return minute * 60;
    }

    private static long timeToSeconds(long time) {
        long minutes = time % 100;
        long hours = (long) (time / Math.pow(10, 2));
        return minToSeconds(minutes) + minToSeconds(hours * 60);
    }

}

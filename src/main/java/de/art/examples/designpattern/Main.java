package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {


    public static void main(String[] args) {
        Element[] elements = {new Taxi(minToSeconds(10)), new Train(timeToSeconds(1050), timeToSeconds(1130), minToSeconds(5)),
                new Airplane(timeToSeconds(1200), timeToSeconds(1400), minToSeconds(20), minToSeconds(5)), new Taxi(minToSeconds(15))};

        TravelTimeVisitor visitor = new TravelTimeVisitor();
        for (Element element : elements) {
            element.accept(visitor);
        }

        System.out.println("Total: " + visitor.getTravelTime());
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

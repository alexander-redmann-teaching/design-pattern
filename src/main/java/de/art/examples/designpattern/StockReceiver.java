package de.art.examples.designpattern;

public class StockReceiver {
    private final String name;
    private int quantity = 0;

    public StockReceiver(String name) {
        this.name = name;
    }

    public void buy(int bought) {
        quantity += bought;
        System.out.println("StockReceiver [ Name: " + name + ", Quantity:" + quantity + " ] bought");
    }

    public void sell(int sold) {
        quantity -= sold;
        System.out.println("StockReceiver [ Name: " + name + ", Quantity:" + quantity + " ] sold");
    }
}

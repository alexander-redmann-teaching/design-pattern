package de.art.examples.designpattern;

public class StockReceiver {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(int bought) {
        quantity += bought;
        System.out.println("StockReceiver [ Name: " + name + ", Quantity:" + quantity + " ]bought ");
    }

    public void sell(int sold) {
        quantity -= sold;
        System.out.println("StockReceiver [ Name: " + name + ", Quantity:" + quantity + " ]sold ");
    }
}

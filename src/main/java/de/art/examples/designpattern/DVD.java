package de.art.examples.designpattern;

public class DVD implements Element {
    private double price;
    private double playtime;

    public DVD(double price, double playtime) {
        this.price = price;
        this.playtime = playtime;
    }

    //accept the visitor
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getPlaytime() {
        return playtime;
    }
}
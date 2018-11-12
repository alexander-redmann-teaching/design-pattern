package de.art.examples.designpattern;

public class Book implements Element {
    private double price;
    private double pages;

    public Book(double price, double pages) {
        this.price = price;
        this.pages = pages;
    }

    //accept the visitor
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getPages() {
        return pages;
    }
}
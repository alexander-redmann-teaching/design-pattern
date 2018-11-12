package de.art.examples.designpattern;

public class ShopingCartVisitor implements Visitor {
    private double totalCostForCart = 0;

    //collect data about the book
    public void visit(Book book) {
        double cost = 0;
        //apply 5$ discount if book price is greater than 50
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else cost = book.getPrice();
        totalCostForCart += cost;
    }

    public void visit(DVD dvd) {
        double cost = 0;
        //apply 1$ discount if dvd price is greater than 20
        if (dvd.getPrice() > 20) {
            cost = dvd.getPrice() - 1;
        } else cost = dvd.getPrice();
        totalCostForCart += cost;
    }

    //return the internal state
    public double getTotalCost() {
        return totalCostForCart;
    }
}

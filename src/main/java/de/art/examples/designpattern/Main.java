package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {


    public static void main(String[] args) {
        Element[] elements = {new Book(20, 1000), new Book(100, 500),
                new DVD(25, 2), new DVD(5, 5)};

        ShopingCartVisitor shoppingCartVisitor = new ShopingCartVisitor();
        for (Element element : elements) {
            element.accept(shoppingCartVisitor);
        }

        System.out.println("Total: " + shoppingCartVisitor.getTotalCost());

    }

}

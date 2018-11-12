package de.art.examples.designpattern;

public interface Visitor {
    void visit(Book book);
    void visit(DVD dvd);

}

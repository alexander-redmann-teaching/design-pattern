package de.art.examples.designpattern;

public interface Visitor {
    void visit(Airplane airplane);

    void visit(Taxi taxi);

    void visit(Train train);
}

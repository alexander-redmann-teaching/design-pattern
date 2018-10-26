package de.art.examples.designpattern;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String[] context) {

        for (String part : context) {
            if (part.equals(data)) {
                return true;
            }
        }
        return false;
    }
}

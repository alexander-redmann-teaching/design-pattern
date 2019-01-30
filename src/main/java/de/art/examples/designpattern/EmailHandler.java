package de.art.examples.designpattern;

public abstract class EmailHandler {
    //reference to the next handler in the chain
    protected EmailHandler successor;

    public void addHandler(EmailHandler handler) {
        if (successor == null) {
            successor = handler;
        } else {
            successor.addHandler(handler);
        }
    }

    //handle request
    public abstract void handleRequest(Email email);
}

package de.art.examples.designpattern;

public abstract class EmailHandler {
    //reference to the next handler in the chain
    protected EmailHandler prevHandler;

    public void addHandler(EmailHandler handler) {
        if (prevHandler == null) {
            prevHandler = handler;
        } else {
            prevHandler.addHandler(handler);
        }
    }

    //handle request
    public abstract void handleRequest(Email email);
}

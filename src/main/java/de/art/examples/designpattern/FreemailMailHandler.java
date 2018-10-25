package de.art.examples.designpattern;

public class FreemailMailHandler extends EmailHandler {

    public void handleRequest(Email email) {
        if (email.getFrom().endsWith("@freemail.net")) {
            //handle request (move to correct folder)
            System.out.println("Processed freemail: " + email.getFrom());
        } else {
            prevHandler.handleRequest(email);
        }
    }
}

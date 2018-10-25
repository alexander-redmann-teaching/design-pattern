package de.art.examples.designpattern;

public class BusinessMailHandler extends EmailHandler {

    public void handleRequest(Email email) {
        if (email.getFrom().endsWith("@businessaddress.com")) {
            //handle request (move to correct folder)
            System.out.println("Processed businessaddress: " + email.getFrom());
        } else {
            prevHandler.handleRequest(email);
        }
    }
}

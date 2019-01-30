package de.art.examples.designpattern;

public class GMailHandler extends EmailHandler {

    public void handleRequest(Email email) {
        if (email.getFrom().endsWith("@gmail.com")) {
            //handle request (move to correct folder)
            System.out.println("Processed gmail: " + email.getFrom());
        } else {
            successor.handleRequest(email);
        }
    }
}

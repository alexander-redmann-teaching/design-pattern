package de.art.examples.designpattern;

public class EmailClient {
    private EmailHandler emailHandler;

    public EmailClient() {
        createProcessor();
    }

    private void createProcessor() {
        emailHandler = new GMailHandler();
        emailHandler.addHandler(new BusinessMailHandler());
        emailHandler.addHandler(new FreemailMailHandler());
    }

    public void addRule(EmailHandler handler) {
        emailHandler.addHandler(handler);
    }

    public void emailReceived(Email email) {
        emailHandler.handleRequest(email);
    }
}

package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        final EmailClient emailClient = new EmailClient();
        emailClient.emailReceived(new Email("test@gmail.com"));
        emailClient.emailReceived(new Email("test@businessaddress.com"));
        emailClient.emailReceived(new Email("test@freemail.net"));
        emailClient.emailReceived(new Email("test@other.com"));
    }
}

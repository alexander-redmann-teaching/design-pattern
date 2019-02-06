package de.art.examples.designpattern;

public interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}

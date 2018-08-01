package de.art.examples.designpattern;

public class ConcreteRemote extends RemoteControl {
    private int currentChannel;

    protected ConcreteRemote(TV implementor) {
        super(implementor);
    }

    public void nextChannel() {
        currentChannel++;
        setChannel(currentChannel);
    }

    public void prevChannel() {
        currentChannel--;
        setChannel(currentChannel);
    }
}

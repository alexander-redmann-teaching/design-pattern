package de.art.examples.designpattern;

public class ConcreteRemoteRefinedAbstraction extends RemoteControlAbstraction {
    private int currentChannel;

    protected ConcreteRemoteRefinedAbstraction(TVImplementor implementor) {
        super(implementor);
    }

    @Override
    void setChannel(int channel) {
        super.setChannel(channel);
        currentChannel = channel;
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

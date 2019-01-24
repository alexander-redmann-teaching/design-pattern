package de.art.examples.designpattern;

public abstract class RemoteControlAbstraction {
    private final TVImplementor implementor;

    RemoteControlAbstraction(TVImplementor implementor) {
        this.implementor = implementor;
    }

    void on() {
        implementor.on();
    }

    void off() {
        implementor.off();
    }

    void setChannel(int channel) {
        implementor.tuneChannel(channel);
    }
}

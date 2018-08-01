package de.art.examples.designpattern;

public abstract class RemoteControl {
    private final TV implementor;

    RemoteControl(TV implementor) {
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

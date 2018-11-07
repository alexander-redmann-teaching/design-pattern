package de.art.examples.designpattern;

import de.art.examples.designpattern.state.Off;
import de.art.examples.designpattern.state.State;

public class CeilingFanPullChainContext {
    private State currentState = new Off();

    public void setState(State s) {
        currentState = s;
    }

    public void pull() {
        currentState.pull(this);
    }
}

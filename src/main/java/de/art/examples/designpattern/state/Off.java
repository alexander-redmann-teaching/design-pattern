package de.art.examples.designpattern.state;

import de.art.examples.designpattern.CeilingFanPullChainContext;

public class Off implements State {
    public void pull(CeilingFanPullChainContext context) {
        System.out.println("low speed");
        context.setState(new Low());
    }
}

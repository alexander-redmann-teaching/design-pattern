package de.art.examples.designpattern.state;

import de.art.examples.designpattern.CeilingFanPullChainContext;

public class Medium implements State {
    public void pull(CeilingFanPullChainContext context) {
        System.out.println("high speed");
        context.setState(new High());
    }
}

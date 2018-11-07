package de.art.examples.designpattern.state;

import de.art.examples.designpattern.CeilingFanPullChainContext;

public class Low implements State {
    public void pull(CeilingFanPullChainContext context) {
        System.out.println("medium speed");
        context.setState(new Medium());
    }
}

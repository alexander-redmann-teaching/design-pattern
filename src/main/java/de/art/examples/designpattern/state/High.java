package de.art.examples.designpattern.state;

import de.art.examples.designpattern.CeilingFanPullChainContext;

public class High implements State {
    public void pull(CeilingFanPullChainContext context) {
        System.out.println("turning off");
        context.setState(new Off());
    }
}

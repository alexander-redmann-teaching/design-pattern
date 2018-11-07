package de.art.examples.designpattern.state;

import de.art.examples.designpattern.CeilingFanPullChainContext;

public interface State {
    void pull(CeilingFanPullChainContext context);
}

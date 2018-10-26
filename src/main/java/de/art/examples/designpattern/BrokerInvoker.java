package de.art.examples.designpattern;

import java.util.ArrayList;
import java.util.List;

public class BrokerInvoker {
    private List<OrderCommandInterface> orderCommandInterfaceList = new ArrayList<OrderCommandInterface>();

    public void takeOrder(OrderCommandInterface orderCommandInterface) {
        orderCommandInterfaceList.add(orderCommandInterface);
    }

    public void placeOrders() {

        for (OrderCommandInterface orderCommandInterface : orderCommandInterfaceList) {
            orderCommandInterface.execute();
        }
        orderCommandInterfaceList.clear();
    }
}

package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {
    public static void main(String[] args) {
        StockReceiver stockReceiver = new StockReceiver("ABC");

        OrderCommandInterface buyStockOrder = new BuyStockCommand(stockReceiver);
        OrderCommandInterface sellStockOrder = new SellStockCommand(stockReceiver);

        BrokerInvoker broker = new BrokerInvoker();
        System.out.println("Take orders");
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(buyStockOrder);
        System.out.println("Place orders");
        broker.placeOrders();
    }
}

package de.art.examples.designpattern;

public class BuyStockCommand implements OrderCommandInterface {
    private StockReceiver stockReceiver;

    public BuyStockCommand(StockReceiver stockReceiver) {
        this.stockReceiver = stockReceiver;
    }

    public void execute() {
        stockReceiver.buy(1);
    }
}

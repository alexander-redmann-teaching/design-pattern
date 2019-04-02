package de.art.examples.designpattern;

public class SellStockCommand implements OrderCommandInterface {
    private StockReceiver stockReceiver;

    public SellStockCommand(StockReceiver stockReceiver) {
        this.stockReceiver = stockReceiver;
    }

    public void execute() {
        stockReceiver.sell(1);
    }
}

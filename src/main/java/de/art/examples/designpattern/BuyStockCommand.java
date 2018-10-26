package de.art.examples.designpattern;

public class BuyStockCommand implements OrderCommandInterface {
    private StockReceiver abcStockReceiver;

    public BuyStockCommand(StockReceiver abcStockReceiver) {
        this.abcStockReceiver = abcStockReceiver;
    }

    public void execute() {
        abcStockReceiver.buy(1);
    }
}

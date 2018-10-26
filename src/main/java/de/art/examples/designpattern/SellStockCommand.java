package de.art.examples.designpattern;

public class SellStockCommand implements OrderCommandInterface {
    private StockReceiver abcStockReceiver;

    public SellStockCommand(StockReceiver abcStockReceiver) {
        this.abcStockReceiver = abcStockReceiver;
    }

    public void execute() {
        abcStockReceiver.sell(1);
    }
}

package de.art.examples.designpattern;

public class CompressionContext {
    private CompressionStrategy strategy;

    //this can be set at runtime by the application preferences
    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    //use the strategy
    public void createArchive(String[] files, String archiveName) {
        System.out.println("Create archive: " + archiveName);
        for (String file : files) {
            strategy.compressFileIntoArchive(file, archiveName);
        }
    }
}

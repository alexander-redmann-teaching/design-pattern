package de.art.examples.designpattern;


public interface CompressionStrategy {
    void compressFileIntoArchive(String file, String archive);
}

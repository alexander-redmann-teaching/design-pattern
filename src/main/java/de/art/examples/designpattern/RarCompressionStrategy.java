package de.art.examples.designpattern;

public class RarCompressionStrategy implements CompressionStrategy {
    public void compressFileIntoArchive(String file, String archive) {
        System.out.println("Compress " + file + " file into RAR archive: " + archive);
    }
}

package de.art.examples.designpattern;

public class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFileIntoArchive(String file, String archive) {
        System.out.println("Compress " + file + " file into ZIP archive: " + archive);
    }
}

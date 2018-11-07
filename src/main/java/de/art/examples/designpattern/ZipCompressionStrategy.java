package de.art.examples.designpattern;

import java.util.List;

public class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(String[] files) {
        System.out.println("Compress " + files.length + " files in ZIP archive");
    }
}

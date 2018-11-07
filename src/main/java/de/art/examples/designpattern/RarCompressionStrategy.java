package de.art.examples.designpattern;

import java.util.List;

public class RarCompressionStrategy implements CompressionStrategy {
    public void compressFiles(String[] files) {
        System.out.println("Compress " + files.length + " files in RAR archive");
    }
}

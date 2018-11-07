package de.art.examples.designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {


    public static void main(String[] args) {
        CompressionContext ctx = new CompressionContext();
        //we could assume context is already set by preferences
        ctx.setCompressionStrategy(new ZipCompressionStrategy());
        //get a list of files...
        ctx.createArchive(new String[] {"a.txt", "b.jpg"});
    }

}

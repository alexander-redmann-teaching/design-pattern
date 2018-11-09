package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {


    public static void main(String[] args) {
        CrossCompiler ios = new IosCompiler();
        ios.crossCompile();
        CrossCompiler android = new AndroidCompiler();
        android.crossCompile();
    }

}

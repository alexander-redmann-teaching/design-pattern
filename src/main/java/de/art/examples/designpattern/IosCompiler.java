package de.art.examples.designpattern;

public class IosCompiler extends CrossCompiler {
    protected void collectSource() {
        System.out.println("Collect IOS sources");
    }

    @Override
    protected void scanSources() {
        System.out.println("Scan IOS sources");
    }

    protected void compileToTarget() {
        System.out.println("Compile IOS sources");
    }
}

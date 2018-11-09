package de.art.examples.designpattern;

public abstract class CrossCompiler {
    public final void crossCompile() {
        collectSource();
        scanSources();
        compileToTarget();
    }
    //Template methods
    protected abstract void collectSource();
    protected abstract void compileToTarget();

    protected void scanSources() {
        System.out.println("Scan Sources");
    }
}

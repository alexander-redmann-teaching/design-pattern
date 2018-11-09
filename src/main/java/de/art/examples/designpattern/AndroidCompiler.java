package de.art.examples.designpattern;

public class AndroidCompiler extends CrossCompiler {
    protected void collectSource() {
        System.out.println("Collect Android sources");
    }

    protected void compileToTarget() {
        System.out.println("Compile Android sources");
    }
}

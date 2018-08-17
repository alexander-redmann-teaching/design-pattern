package de.art.examples.designpattern;

import de.art.examples.designpattern.sample1.InternalClass1;
import de.art.examples.designpattern.sample2.InternalClass2;

public class Facade {
    private final InternalClass1 internalClass1 = new InternalClass1();
    private final InternalClass2 internalClass2 = new InternalClass2();

    public String getCrazyStuff1() {
        return internalClass1.doSomethingCrazy();
    }

    public String getCrazyStuff2() {
        return internalClass2.doSomethingCrazy();
    }
}

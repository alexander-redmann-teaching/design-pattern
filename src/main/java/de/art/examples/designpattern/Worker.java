package de.art.examples.designpattern;

public class Worker {
    private String name;

    public Worker() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String doSomething() {
        return name + "is working";
    }
}

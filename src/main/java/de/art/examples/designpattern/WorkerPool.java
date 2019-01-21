package de.art.examples.designpattern;

import java.util.Stack;

public class WorkerPool {
    private final Stack<Worker> instances = new Stack<Worker>();

    public void pushWorker(Worker worker) {
        instances.push(worker);
    }

    public Worker popWorker() {
        return instances.pop();
    }
}

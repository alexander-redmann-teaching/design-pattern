package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Start");
        WorkerPool workerPool = new WorkerPool();
        final Worker worker0 = new Worker();
        worker0.setName("Worker 0");
        workerPool.pushWorker(worker0);
        System.out.println("Created worker0: " + worker0.getName() + " " + (System.currentTimeMillis() - startTime));

        final Worker worker1 = new Worker();
        worker1.setName("Worker 1");
        workerPool.pushWorker(worker1);
        System.out.println("Created worker1: " + worker1.getName() + " " + (System.currentTimeMillis() - startTime));

        Worker getWorker0 = workerPool.popWorker();
        System.out.println("Pop0: " + getWorker0.doSomething() + " " + (System.currentTimeMillis() - startTime));
        workerPool.pushWorker(getWorker0);
        Worker getWorker1 = workerPool.popWorker();
        Worker getWorker2 = workerPool.popWorker();
        System.out.println("Pop1: " + getWorker1.doSomething() + " " + (System.currentTimeMillis() - startTime));
        System.out.println("Pop2: " + getWorker2.doSomething() + " " + (System.currentTimeMillis() - startTime));

//        Worker getWorker3 = workerPool.popWorker();
    }
}

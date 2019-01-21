package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        long startTime = System.currentTimeMillis();
        System.out.println("Start");
        ZooPool zooPool = new ZooPool();
        final Animal tiger = new Animal();
        tiger.setName("Tiger");
        tiger.setColor("Orange");
        tiger.setLimbs(4);
        tiger.setSound("Roar");
        tiger.setMammal(true);
        zooPool.pushAnimal(tiger);
        System.out.println("Created Tiger: " + tiger + " " + (System.currentTimeMillis() - startTime));

        final Animal ape = new Animal();
        ape.setName("Ape");
        ape.setColor("brown");
        ape.setLimbs(4);
        ape.setSound("Uhuh");
        ape.setMammal(true);
        zooPool.pushAnimal(ape);
        System.out.println("Created Ape: " + ape + " " + (System.currentTimeMillis() - startTime));

        Animal animal0 = zooPool.popAnimal();
        System.out.println("Pop0: " + animal0 + " " + (System.currentTimeMillis() - startTime));
        zooPool.pushAnimal(animal0);
        Animal animal1 = zooPool.popAnimal();
        Animal animal2 = zooPool.popAnimal();
        System.out.println("Pop1: " + animal1 + " " + (System.currentTimeMillis() - startTime));
        System.out.println("Pop2: " + animal2 + " " + (System.currentTimeMillis() - startTime));

//        Animal animal3 = zooPool.popAnimal();
    }
}

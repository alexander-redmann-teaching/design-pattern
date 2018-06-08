package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Start");
        ZooPool zooPool = new ZooPool();
        final Animal tiger = new Animal();
        tiger.setName("Tiger");
        tiger.setColor("Orange");
        tiger.setLimbs(4);
        tiger.setSound("Roar");
        tiger.setMammal(true);
        zooPool.pushAnimal(tiger);
        System.out.println("Created Tiger: " + tiger);

        final Animal ape = new Animal();
        ape.setName("Ape");
        ape.setColor("brown");
        ape.setLimbs(4);
        ape.setSound("Uhuh");
        ape.setMammal(true);
        zooPool.pushAnimal(ape);
        System.out.println("Created Ape: " + ape);

        Animal animal = zooPool.popAnimal();
        System.out.println("Pop: "+animal);
        zooPool.pushAnimal(animal);
        Animal animal1 = zooPool.popAnimal();
        Animal animal2 = zooPool.popAnimal();
        System.out.println("Pop1: "+animal1);
        System.out.println("Pop2: "+animal2);

//        Animal animal3 = zooPool.popAnimal();
    }
}

package de.art.examples.designpattern;

public class Animal {
    private final String color;
    private final int limbs;
    private final String name;

    public Animal(String color, int limbs, String name) {
        this.color = color;
        this.limbs = limbs;
        this.name = name;
    }

    public String getColor() {
        return color;
    }


    public int getLimbs() {
        return limbs;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", limbs=" + limbs +
                ", name='" + name + '\'' +
                '}';
    }
}

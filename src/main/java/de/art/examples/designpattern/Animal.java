package de.art.examples.designpattern;

import java.util.HashMap;
import java.util.Map;

public class Animal {
    private static Map<String, Animal> instanceMap = new HashMap<String, Animal>();
    private String name;
    private String sound;
    private String color;
    private int limbs;
    private boolean isMammal;

    private Animal() {
    }

    public static Animal getInstance(String key) {
        Animal instance = instanceMap.get(key);
        if (instance == null) {
            instance = new Animal();
            instanceMap.put(key, instance);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                ", color='" + color + '\'' +
                ", limbs=" + limbs +
                ", isMammal=" + isMammal +
                '}';
    }
}

package de.art.examples.designpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public abstract class AnimalPrototype implements Cloneable {

    @Override
    public AnimalPrototype clone() throws CloneNotSupportedException {
        try {
            final Class<?> clazz = Class.forName(this.getClass().getName());
            final Constructor<?> ctor = clazz.getConstructor();
            final AnimalPrototype clone = (AnimalPrototype) ctor.newInstance();
            final Field[] prototypeFields = this.getClass().getDeclaredFields();

            for (Field field : prototypeFields) {
                final boolean accessible = field.isAccessible();
                field.setAccessible(true);
                final Object value = field.get(this);
                field.set(clone, value);
                field.setAccessible(accessible);
            }

            return clone;
        } catch (Exception e) {
            throw new CloneNotSupportedException("Error on creating clone: " + e.getMessage());
        }
    }

}

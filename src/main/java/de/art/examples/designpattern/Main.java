package de.art.examples.designpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {
    public static void main(String[] args) {
        Iterator it = getIterator();

        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next.toString());
        }
    }

    private static Iterator getIterator() {
        ArrayList list = new ArrayList();
        list.add("Chaitanya");
        list.add("Steve");
        list.add("Jack");
        list.add(5);
        list.add(new Object());

        return list.iterator();
    }
}

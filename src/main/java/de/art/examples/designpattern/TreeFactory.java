package de.art.examples.designpattern;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypeMap = new HashMap<String, TreeType>();

    public static TreeType getTreeType(String name, String color, String texture) {
        TreeType result = treeTypeMap.get(name);
        if (result == null) {
            result = new TreeType(name, color, texture);
            System.out.println("Create new tree: " + name);
            treeTypeMap.put(name, result);
        }
        return result;
    }
}

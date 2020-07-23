package com.codedifferently.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VariousMapsDemo {

    public static void main(String... args){
        VariousMapsDemo vmd = new VariousMapsDemo();
        vmd.hashMapDemo();
        vmd.treeMapDemo();
        vmd.linkedHashMapDemo();
    }

    public void hashMapDemo() {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 4);
        System.out.println(map.entrySet());
    }

    public void treeMapDemo() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 4);
        System.out.println(map.entrySet());
    }

    public void linkedHashMapDemo() {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 4);
        System.out.println(map.entrySet());
    }
}

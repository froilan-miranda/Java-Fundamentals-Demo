package com.codedifferently.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDemo {

    public static void main(String... args){
        MapInterfaceDemo md = new MapInterfaceDemo();
        md.example11();
    }

    public void example01() {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println(map.entrySet());
    }

    public void example02() {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> newMap = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        newMap.putAll(map);

        System.out.println(newMap.entrySet());
    }

    public void example03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println(map.get("Two")); // prints 2
    }

    public void example04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.replace("Two", 3);
        System.out.println(map.get("Two"));// prints 3
    }

    public void example05() {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.remove("Two");
        System.out.println(map.get("Two")); // prints null
    }

    public void example06   () {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println(map.containsKey("One")); //prints true
    }

    public void example07() {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println(map.containsValue(1)); //prints true
    }

    public void example08() {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println(map.size()); //prints 3
    }

    public void example09() {
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map.size()); //prints 0
        System.out.println(map.isEmpty()); //prints true

        map.put("One", 1);
        System.out.println(map.isEmpty()); //prints false
        System.out.println(map.size()); //prints 1
    }

    public void example10() {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println(map.entrySet());
    }

    public void example11() {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.clear();
        System.out.println(map.isEmpty()); // prints true
    }
}

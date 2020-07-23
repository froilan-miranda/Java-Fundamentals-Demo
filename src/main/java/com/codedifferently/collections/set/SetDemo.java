package com.codedifferently.collections.set;

import java.util.*;

public class SetDemo {
    public static void main(String... args){
        SetDemo sd = new SetDemo();
        sd.example01();
        sd.example02();
        sd.example03();
    }

    public void example01(){
        String[] words = {"John", "Charles", "Cutler", "Tuskegee"};
        Set<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println(set);
    }

    public void example02() {
        String[] words = {"John", "Charles", "Cutler", "Tuskegee"};
        Set<String> set = new TreeSet<>(Arrays.asList(words));
        System.out.println(set);
    }

    public void example03() {
        String[] words = {"John", "Charles", "Cutler", "Tuskegee"};
        Set<String> set = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(set);
    }
}

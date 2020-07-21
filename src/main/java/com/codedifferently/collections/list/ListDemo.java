package com.codedifferently.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String... args){
        ListDemo ld = new ListDemo();
        ld.example04();
    }

    public void example01() {
        String[] array = {"The", "Quick", "Brown", "Fox"};
        List<String> unmodifiableList = Arrays.asList(array);
        unmodifiableList.add("Jumps"); // throws Exception
    }

    public void example02() {
        String[] array = {"The", "Quick", "Brown", "Fox"};
        List<String> unmodifiableList = Arrays.asList(array);
        List<String> arrayList = new ArrayList<>(unmodifiableList);
        System.out.println(arrayList);
    }

    public void example03() {
        String[] phrase = {"The", "Quick", "Brown", "Fox"};
        List<String> list = new ArrayList<>();
        for(String word : phrase) {
            list.add(word);
        }
    }

    public void example04() {
        String[] phrase = {"The", "Quick", "Brown", "Fox"};
        List<String> list = new ArrayList<>(Arrays.asList(phrase));
        List<String> listToBePopulated = new ArrayList<>();
        list.forEach(word -> listToBePopulated.add(word));
    }
}

package com.codedifferently.generics.container;

import java.util.ArrayList;

public class Runner {
    public static void main(String... args){
        ArrayList<? extends Pet> myList;

        myList = new ArrayList<>();

        Container<String> container = new Container<>();

        String hello = "Hello, World!";

        container.put(hello);
        String[] array = new String[1];

        array = container.toArray(array);

        String s = container.get(); //Must be cast

        Pair<Integer, Boolean> mypair = new Pair<>();


        double middle = MiddleHelper.getMiddle(3.14, 1729.0, 0.0);
    }
}

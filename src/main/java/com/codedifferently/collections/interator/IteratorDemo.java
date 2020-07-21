package com.codedifferently.collections.interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorDemo {

    public static void main(String... args){
        IteratorDemo id = new IteratorDemo();
        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("red");
        strArr.add("green");
        strArr.add("blue");

//        id.printIterable01(strArr);
//        id.printIterable02(strArr);
//
        System.out.println(strArr.get(0));
        id.deleteFirstElement(strArr.iterator());
        System.out.println(strArr.get(0));

    }

    public void printIterable01(Iterable<String> iterable) {
        Iterator iterator = iterable.iterator();
        while(iterator.hasNext()) {
            System.out.println("Current Element = " + iterator.next());
        }
    }

    public void printIterable02(Iterable<String> iterable) {
        Iterator iterator = iterable.iterator();
        Consumer cc = new ColorConsumer();
        iterator.forEachRemaining(cc);
    }

    public void deleteFirstElement(Iterator<String> iterator) {
        iterator.next(); // skip first element
        iterator.remove(); // remove first element
    }
}

class ColorConsumer implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
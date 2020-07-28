package com.codedifferently.generics.container;

import java.util.Comparator;

public class Container<T> {
    private T element;

    public T get(){return element;}

    public T[] toArray(T[] newArray){
        newArray[0] = element;
        return newArray;
    }

    public void put(T item){ element = item; }
}

package com.codedifferently.generics.container;

public class MiddleHelper {
    public static <T> T getMiddle(T... a) {
        return a[a.length /2 ];
    }
}

package com.codedifferently.lambda.methodrefs;

import java.util.Arrays;

public class ArbitraryObject {

    public static void main(String[] args) {
        String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
        /* Method reference to an instance method of an arbitrary
         * object of a particular type
         */
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for(String str: stringArray){
            System.out.println(str);
        }
    }
}
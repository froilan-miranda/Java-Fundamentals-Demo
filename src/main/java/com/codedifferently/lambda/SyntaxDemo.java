package com.codedifferently.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class SyntaxDemo {

    public static void mySweetPrintFunction(String s){
        System.out.println(s);
    }

    public static void main(String... args){

        /**
         * No argument
         */
        Runnable run = () -> System.out.println("Hi");

        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Hi");

        /**
         * Explicity declaring data types and single argument
         */
        //Consumer<String> consumer = (String s) -> System.out.println(s);

        /**
         * Explicity declaring data types and multi argument
         */
        BiConsumer<String, String> bisumer = (String s1, String s2) -> System.out.println(s1 + s2);


        /**
         * Data types declared by inference
         */
        Consumer consumer2 = (Object s) -> System.out.println(s);

        /**
         * If the lambda expression uses as a parameter name the same as a
         * variable name of the enclosing context, a compile error is generated:
         */
//        String s = "";
//
//        Consumer consumer3 = (s) -> { System.out.println(s); };

        /**
         * BiConsumer with multiple lines of logic
         */
        BiConsumer<String, String> bisumer2 = (String s1, String s2) -> {
            String s3 = s1 + s2;
            System.out.println(s3);
        };


    }
}

package com.codedifferently.collections.stack;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String... args){
        StackDemo sd = new StackDemo();
        sd.example05();
    }

    public void example01() {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.isEmpty()); // prints true
    }

    public void example02() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        System.out.println(stack.isEmpty()); // prints false
    }

    public void example03() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        System.out.println(stack.peek());
    }

    public void example04() {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.isEmpty()); // prints true

        stack.push("Hello world");
        System.out.println(stack.isEmpty()); // prints false

        String topValue = stack.pop();
        System.out.println(topValue); //prints "Hello World"
        String topValue2 = stack.pop(); // throws EmptyStackException
    }

    public void example05() {
        Stack<String> stack = new Stack<>();

        stack.push("Now,");
        stack.push("Lets get weird with it");

        Vector<String> weirdo = stack;

        weirdo.add(2, "so weird");
        weirdo.add(0, "very very weird");


        String topValue = stack.pop();
        System.out.println(topValue); //prints
    }

}

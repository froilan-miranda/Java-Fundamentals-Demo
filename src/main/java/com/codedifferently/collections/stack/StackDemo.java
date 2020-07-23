package com.codedifferently.collections.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String... args){
        StackDemo sd = new StackDemo();

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
}

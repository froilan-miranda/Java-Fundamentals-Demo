package com.codedifferently.lambda.methodrefs;

@FunctionalInterface
interface Displayable {
    Hello display(String say);
}

class Hello{
    public Hello(String say){
        System.out.print(say);
    }
}

public class ConstructorRef {
    public static void main(String[] args) {
        //Method reference to a constructor
        Displayable ref = Hello::new;
        ref.display("Hello World!");
    }
}
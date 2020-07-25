package com.codedifferently.lambda.methodrefs;

@FunctionalInterface
interface MyInterface{
    void display();
}
public class InstaceMethod {
    public void myMethod(){
        System.out.println("Instance Method");
    }
    public static void main(String[] args) {
        InstaceMethod obj = new InstaceMethod();
        // Method reference using the object of the class
        MyInterface ref = obj::myMethod;
        // Calling the method of functional interface
        ref.display();
    }
}
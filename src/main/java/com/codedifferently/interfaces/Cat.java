package com.codedifferently.interfaces;

public class Cat extends Pet implements Comparable<Cat>{

    private int age;

    public Cat(int age){
        this.age  = age;
    }

    public int compareTo(Cat otherCat){
        return otherCat.age - this.age;
    }

    public int getAge(){
        return this.age;
    }

}

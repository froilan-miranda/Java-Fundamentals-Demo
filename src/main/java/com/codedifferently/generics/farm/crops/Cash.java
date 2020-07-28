package com.codedifferently.generics.farm.crops;


public class Cash implements Yieldable {
    private String name;
    private final int yieldAge;
    private int age;
    private boolean yieldable = false;


    public Cash(String name, int yieldAge) {
        this.name = name;
        this.yieldAge = yieldAge;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void grow(){

        if(++this.age >= this.yieldAge){
            yieldable = true;
        }
    }

    public int getAge() { return age; }

    public boolean isYieldable() {
        return yieldable;
    }

    public void cure(){
        System.out.printf("curing this %s", this.name);
    }

    @Override
    public String toString() {
        return String.format("%s is %d months old", name, age);
    }

}

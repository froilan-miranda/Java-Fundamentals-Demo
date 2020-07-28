package com.codedifferently.generics.farm.crops;

public class Horticulture {
    private String name;
    private final int yieldAge;
    private int age;
    private boolean yieldable = false;

    public Horticulture(String name, int yieldAge) {
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

    public void harvest(){
        System.out.printf("harvest this %s", this.name);
    }

    @Override
    public String toString() {
        return String.format("%s is %d months old", name, age);
    }

}

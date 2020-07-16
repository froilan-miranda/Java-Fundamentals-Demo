package com.codedifferently.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DemoRunner {
    public static void main(String... args){
        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(new Cat(3));
        cats.add(new Cat(10));
        cats.add(new Cat(3));
        cats.add(new Cat(56));
        cats.add(new Cat(12));

        Collections.sort(cats);

        Pet pet1 = new Cat(2);

        Dog d = new Dog();


        if(Cat.class.isInstance(pet1)){
            Cat cat = (Cat)pet1;
        }else if (pet1 instanceof Dog){
            Dog dog1 = (Dog)pet1;
        }

        Ridable ridable = new Horse();
        Ridable ridable1 = new Tractor();

        List<Cat> cats1 = new LinkedList<>();






        System.out.println(cats.get(cats.size()-1).getAge());

        Farmer myFarmer = new Farmer();

        Vehicle v = new Vehicle();

        Tractor t = new Tractor();

        myFarmer.letsRide(v);
        myFarmer.letsRide(t);

    }
}

package com.codedifferently.interfaces;

public class Vehicle implements Ridable{
    private int xPos = 0;

    public void ride(){
        xPos += 2;
    }
}

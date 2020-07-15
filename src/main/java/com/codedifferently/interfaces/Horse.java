package com.codedifferently.interfaces;

public class Horse implements Ridable{

    int xPos=0;

    public void ride(){
        xPos += 5;
    }
}

package com.codedifferently.interfaces;

public class CatDemo implements SomeInterface{
    public boolean someBoolFunc(){
        return true;
    }
    public Object funcReturnsAnObject(){
        return new Object();
    }
    public Cat returnCat(){
        return new Cat(7);
    }
}

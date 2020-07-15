package com.codedifferently.interfaces;

import java.util.ArrayList;

public class Farmer implements FirstExample, SecondExample{

    public void letsRide(Ridable r){
        r.ride();
    }

    @Override
    public boolean isTrue() {
        return false;
    }
}

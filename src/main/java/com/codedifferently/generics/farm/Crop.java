package com.codedifferently.generics.farm;

import com.codedifferently.generics.farm.crops.Yieldable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crop<T extends Yieldable> {

    private List<T> plants = new ArrayList<>();

    public void sow(T[] p) {
        plants.addAll(Arrays.asList(p));
    }

    public T[] reap(T[] a) {

        for(int i=0, j=0; i<plants.size(); i++){
            if(plants.get(i).isYieldable()){
                a[j] = plants.get(i);
            }
        }
        plants.removeAll(Arrays.asList(a));

        return a;
    }

    public void growPlants(){
        for (T c: plants){
            c.grow();
        }
    }

    public ArrayList<T> getPlants(){
        return (ArrayList<T>)plants;
    }

    public int yieldCount() {
        int yieldCount=0;

        for(T p : plants){
            yieldCount = (p.isYieldable()) ? yieldCount + 1 : yieldCount;
        }

        return yieldCount;
    }
}

package com.codedifferently.generics.farm;

import com.codedifferently.generics.farm.crops.Cash;
import com.codedifferently.generics.farm.crops.Yieldable;

import java.util.ArrayList;

public class Farmer {
    private String name;

    public Farmer(String name){
        this.name = name;
    }

    public void sow(Crop crop, Yieldable[] plants){
        crop.sow(plants);
    }

    public void grow(Crop crop){
        crop.growPlants();
    }

    public void processCashCrop(Crop<Cash> crop){
        System.out.println("\nTime to get the goods\n=================");
        Cash[] cashCrop = crop.reap(new Cash[crop.yieldCount()]);
        for(Object c : cashCrop) System.out.println(c);

        System.out.println("\nTime to cure the goods\n=================");
        for(Cash c : cashCrop){
            c.cure();
        }
    }

    public String getName() { return name; }

    public void inspectCashCrop(Crop<Cash> crop) {
        ArrayList<Cash> plants = crop.getPlants();

        for(Yieldable c : plants) System.out.println(c);
    }
}

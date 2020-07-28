package com.codedifferently.generics.farm;

import com.codedifferently.generics.farm.crops.Cash;
import com.codedifferently.generics.farm.crops.Food;
import com.codedifferently.generics.farm.crops.Yieldable;

public class Runner {
    public static void main(String... args){
        Farmer olMcdonald = new Farmer("ol mcdonald");

        Cash cashPlant1 = new Cash("sugarcane", 3);
        Cash cashPlant2 = new Cash("oilseeds", 5);
        Cash[] cashPlants = new Cash[]{cashPlant1, cashPlant2};

        Crop<Cash> cashCrop = new Crop<>();
        olMcdonald.sow(cashCrop, cashPlants);

        Food foodPlant1 = new Food("wheat", 2);
        Food foodPlant2 = new Food("rice", 3);
        Food[] foodPlants = new Food[]{foodPlant1, foodPlant2};

        Crop<Food> foodCrop = new Crop<>();
        olMcdonald.sow(foodCrop, foodPlants);

        olMcdonald.grow(cashCrop);
        olMcdonald.grow(cashCrop);
        olMcdonald.grow(cashCrop);
        olMcdonald.grow(cashCrop);

        olMcdonald.inspectCashCrop(cashCrop);
        olMcdonald.processCashCrop(cashCrop);

    }
}

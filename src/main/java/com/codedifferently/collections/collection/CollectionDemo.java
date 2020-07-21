package com.codedifferently.collections.collection;

import java.util.*;

public class CollectionDemo {

    public static void main(String... args){
        CollectionDemo cd = new CollectionDemo();
        cd.example11();
    }

    public void example01() {
        Collection<String> set = new HashSet<>();
        String valueToBeAdded = "Hedjet";
        set.add(valueToBeAdded);
        System.out.println(set.add(valueToBeAdded)); // prints false
    }

    public void example02() {
        Collection<String> set = new HashSet<>();
        String[] valuesToBeAdded = {"Froilan", "Tariq", "Eric", "Stephanie", "Leah"};
        Collection<String> valuesAsList = Arrays.asList(valuesToBeAdded);
        System.out.println(set.addAll(valuesAsList)); // prints true
    }

    public void example03() {
        ArrayList<Object> objectArray = new ArrayList<>();
        System.out.println(objectArray.remove(new Object()));
    }

    public void example04() {
        String[] elementsAsArray = {"The", "Quick", "Brown"};
        Collection<String> originalCollection = new ArrayList<>();
        Collection<String> elementsAsList = Arrays.asList(elementsAsArray);

        // prints false
        System.out.println(originalCollection.removeAll(elementsAsList));
    }

    public void example05() {
        String[] elementsAsArray = {"The", "Quick", "Brown"};
        Collection<String> originalCollection = new ArrayList<>();
        originalCollection.add("Quick");
        Collection<String> elementsAsList = Arrays.asList(elementsAsArray);


        // prints true
        System.out.println(originalCollection.removeAll(elementsAsList));
    }

    public void example06() {
        String[] originalArray = {"The", "Quick", "Brown"};
        String[] elementsToBeRetained = {"The", "Quick"};
        Collection<String> originalList = new ArrayList<>(Arrays.asList(originalArray));
        Collection<String> retentionList = Arrays.asList(elementsToBeRetained);

        System.out.println(originalList.size());
        // prints true
        System.out.println(originalList.retainAll(retentionList));
        System.out.println(originalList.size());
    }

    public void example07() {
        String[] elementsAsArray = {"The", "Quick", "Brown"};
        Collection<String> elementsAsList = Arrays.asList(elementsAsArray);
        System.out.println(elementsAsList.isEmpty()); // prints false
    }

    public void example08() {
        String[] elementsAsArray = {"The", "Quick", "Brown"};
        Collection<String> elementsAsList = Arrays.asList(elementsAsArray);
        System.out.println(elementsAsList.size()); // prints 3
    }

    public void example09() {
        String[] elementsAsArray = {"The", "Quick", "Brown"};
        List<String> elementsAsList = new ArrayList<>(Arrays.asList(elementsAsArray));
        elementsAsList.clear();
        System.out.println(elementsAsList.isEmpty()); // prints true
    }

    public void example10() {
        String[] elementsToAdd = {"The", "Quick", "Brown"};
        List<String> elementList = new ArrayList<>(Arrays.asList(elementsToAdd));
        Object[] listAsObjectArray = elementList.toArray();
    }

    public void example11() {
        String[] elementsToAdd = {"The", "Quick", "Brown"};
        List<String> elementList = new ArrayList<>(Arrays.asList(elementsToAdd));

        int newArrayLength = elementList.size();
        String[] arrayToBePopulated = new String[newArrayLength];
        String[] listAsStringArray = elementList.toArray(arrayToBePopulated);

        System.out.printf("Originl length: %d\n", newArrayLength);
        System.out.printf("New array length: %d", listAsStringArray.length);
    }
}

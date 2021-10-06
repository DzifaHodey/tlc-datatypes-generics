package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class NoDuplicateArray {
    private Integer[] arr2 = new Integer[6];
    private List<Integer> arrList = new ArrayList();
    private int randomNumber;
    private int counter=0;


    public Integer[] populateArray(){
        do {
            randomNumber = ThreadLocalRandom.current().nextInt(1, 50);
            if (!arrList.contains(randomNumber)) {
                arrList.add(randomNumber);
                counter++;
            }
        }
        while (counter<arr2.length);
        arr2 = arrList.toArray(arr2);
        return arr2;
    }

    public Integer[] sortArray(){
        Arrays.sort(arr2);
        System.out.println("array");
        return arr2;

    }


}



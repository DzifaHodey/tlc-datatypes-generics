package com.company;

import java.util.Arrays;

public class ArrayLab {
    private int arraySize;
    private int[] numArray;


    public ArrayLab(int arraySize) {
        this.arraySize = arraySize;
        numArray = new int[arraySize];
        addValues();
    }

    private void addValues(){
        for (int i =0; i<arraySize; i++){
            numArray[i] = i+1;
        }
    }

    public int[] getNumArray() {
        return numArray;
    }


}

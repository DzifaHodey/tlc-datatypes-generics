package com.company;

import java.util.Arrays;
import java.util.Objects;

public class ArrayLab {
    private int arraySize;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayLab arrayLab = (ArrayLab) o;
        return arraySize == arrayLab.arraySize && Arrays.equals(numArray, arrayLab.numArray);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(arraySize);
        result = 31 * result + Arrays.hashCode(numArray);
        return result;
    }

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

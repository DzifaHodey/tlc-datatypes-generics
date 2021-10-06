package com.company;

import com.company.ArrayLab;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayLabTest {

    @org.junit.jupiter.api.Test
    void testGetNumArray() {
        ArrayLab arr1 = new ArrayLab(5);
        int[] expected = {1,2,3,4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(arr1.getNumArray()));
    }
}
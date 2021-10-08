package com.company;

public class StackElement<T> {
    int key;
    T val;

    public StackElement(int key, T val) {
        this.key = key;
        this.val = val;
    }
}

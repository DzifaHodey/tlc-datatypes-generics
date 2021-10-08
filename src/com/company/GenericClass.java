package com.company;

import java.util.Stack;

public class GenericClass<T>{

    private Stack<T> stack = new Stack<>();

    void push(T t){
        stack.push(t);
    }

    T top(){
        return stack.lastElement();
    }

    void pop(){
        stack.pop();
    }

    int size(){
        return stack.size();
    }



}

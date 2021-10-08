package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GenericPriorityStack<T> {
    PriorityQueue<StackElement> queue = new PriorityQueue<>(10, new Comparator<StackElement>() {
        @Override
        public int compare(StackElement stackElement1, StackElement stackElement2) {
            return stackElement1.key - stackElement2.key;
        }
    });

    int order = 1;

    void push(T value){
        System.out.println(order);
        StackElement element = new StackElement(order++, value);
        System.out.println(order);
        queue.add(element);
    }

//    T top(){
//        return queue.peek().val;
//    }






}

package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenericClassTest {
    GenericClass<Integer> intGenClass;
    @BeforeEach
    void createObject(){
        intGenClass = new GenericClass<>();
        intGenClass.push(37);
        intGenClass.push(24);
        intGenClass.push(1234);
        intGenClass.push(434);
        intGenClass.push(5);
        intGenClass.push(87);
        intGenClass.push(99);
    }


    @Test
    void testPush() {
        intGenClass.push(37);
        assertEquals(8, intGenClass.size());

    }

    @Test
    void top() {
        assertEquals(99,intGenClass.top());

    }

    @Test
    void pop() {
        intGenClass.pop();
        assertEquals(87, intGenClass.top());
    }

    @Test
    void size() {
        assertEquals(7, intGenClass.size());
    }
}
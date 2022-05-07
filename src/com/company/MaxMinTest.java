package com.company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinTest {

    @Test
    void max() {
        MaxMin x1= new MaxMin();
        assertEquals(1000,x1.max(new int[]{10, 100, 50, 90, 1000}));
    }
    @Test
    void max1() {
        MaxMin x1= new MaxMin();
        assertEquals(9555,x1.max(new int[]{10, 9555, 0, 440, 1201}));
    }

    @Test
    void min() {
        MaxMin x1= new MaxMin();
        assertEquals(10,x1.min(new int[]{10, 100, 50, 90, 1000}));
    }
    @Test
    void min1() {
        MaxMin x1= new MaxMin();
        assertEquals(0,x1.min(new int[]{10, 9555, 0, 440, 1201}));
    }
}
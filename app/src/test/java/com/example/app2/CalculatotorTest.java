package com.example.app2;

import junit.framework.TestCase;

public class CalculatotorTest extends TestCase {

    public void testAdd() {
        int expected=30;
        int actual=Calculatotor.add(10,20);
        assertEquals(expected, actual);
    }
}
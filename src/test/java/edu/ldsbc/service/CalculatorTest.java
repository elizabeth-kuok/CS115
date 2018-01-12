package edu.ldsbc.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add()  {
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.add(1,1));
        assertEquals(5, calculator.add(2,3));
        assertNotEquals(8, calculator.add(500, 3));

    }
    public void divide() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.divide(100,20));
        assertEquals(6, calculator.divide(30,5));
        assertNotEquals(8, calculator.divide(2, 3));
    }
    public void subtraction() {
        Calculator calculator = new Calculator();

        assertEquals(10, calculator.subtraction(15,5));
        assertEquals(20, calculator.subtraction(25,5));
        assertNotEquals(8, calculator.subtraction(20, 3));
    }
    public void multiply() {
        Calculator calculator = new Calculator();

        assertEquals(10, calculator.multiply(2,5));
        assertEquals(20, calculator.multiply(4,5));
        assertNotEquals(8, calculator.multiply(2, 3));
    }

}
package de.mobilcom.dpvo.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    
    @Test
    public void testFibonaciZero() {
        assertEquals(0, Calculator.fibonaci(0)); 
    }
    
    @Test
    public void testFibonaciOne() {
        assertEquals(1, Calculator.fibonaci(1)); 
    }

    @Test
    public void testFibonaciTwo() {
        assertEquals(1, Calculator.fibonaci(2)); 
    }

    @Test
    public void testFibonaci() {
        assertEquals(2, Calculator.fibonaci(3)); 
    }
    
}

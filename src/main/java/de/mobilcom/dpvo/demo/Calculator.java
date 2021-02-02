package de.mobilcom.dpvo.demo;

public class Calculator {
    public static long fibonaci(long number) {
        return (number <= 1) 
                ? number 
                : fibonaci(number-1) + fibonaci(number-2); 
    }
}

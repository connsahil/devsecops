package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(8, calculator.add(5,3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5,3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiply(5,3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6,3));
    }

    @Test
    void testDivideByZero() {

        Exception exception = assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10,0)
        );

        assertTrue(exception.getMessage().contains("zero"));
    }
}

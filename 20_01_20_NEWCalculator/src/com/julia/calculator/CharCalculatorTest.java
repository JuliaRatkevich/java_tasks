package com.julia.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharCalculatorTest {

    private CharCalculator charCalculator = new CharCalculator();

    @Test
    public void getClassName() {
        assertEquals("Operation_43", charCalculator.getClassName('+'));
    }
}
package com.julia.calculator.char_operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Operation_43Test {

    @Test
    void apply() {
        double x = 1.3;
        double y = 4.5;
        double expected = x + y;
        Operation_43 sut = new Operation_43();

        double result = sut.apply(x, y);

        assertEquals(result, expected);
    }
}
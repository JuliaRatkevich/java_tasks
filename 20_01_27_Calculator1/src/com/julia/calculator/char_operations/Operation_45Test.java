package com.julia.calculator.char_operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Operation_45Test {

    @Test
    void apply() {
        double x = 8.3;
        double y = 4.5;
        double expected = x + y;
        Operation_45 sut = new Operation_45();

        double result = sut.apply(x, y);

        assertEquals(result, expected);
    }
}
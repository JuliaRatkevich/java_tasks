package com.julia.calculator.modern_operations;

import com.julia.calculator.ModernOperation;

public class OperationAdd implements ModernOperation {
    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double apply(double num1, double num2) {
        return num1 + num2;
    }
}


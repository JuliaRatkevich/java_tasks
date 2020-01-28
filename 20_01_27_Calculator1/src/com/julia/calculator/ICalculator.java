package com.julia.calculator;

public interface ICalculator {

    double calculate(double num1, double num2, char operation) throws WrongOperandException;
}

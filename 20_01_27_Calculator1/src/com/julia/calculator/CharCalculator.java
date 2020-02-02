package com.julia.calculator;

public class CharCalculator implements ICalculator {

    private static final String PATH_TO_OPERATIONS =
            "com.julia.calculator.char_operations.";

    @Override
    public double calculate(double num1, double num2, char operand) throws WrongOperandException {
        String pathToClass = PATH_TO_OPERATIONS + getClassName(operand);
        Operation operation = null;
        try {
            operation = (Operation) getClass().forName(pathToClass).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
//            e.printStackTrace();
            throw new WrongOperandException();
        }

        return operation.apply(num1, num2);
    }

      String getClassName(char operand) {
        return "Operation_" + (int)operand;
    }
}

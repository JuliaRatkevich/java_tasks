package com.julia.calculator;

import com.julia.calculator.modern_operations.OperationAdd;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ModernCalculatorTest {

    ModernCalculator modernCalculator;
    OperationManager om;
    Operation operation;

    @Before
    public void init() {
        operation = mock(Operation.class);
        om = mock(OperationManager.class);
        modernCalculator = new ModernCalculator(om);
    }

    @Test
    public void testCalculate_legalOperation() throws WrongOperandException {
        when(om.get('∂')).thenReturn(operation);
        when(operation.apply(4, 5)).thenReturn(789.);

        double expected = 789;

        assertEquals(expected, modernCalculator.calculate(4, 5, '∂'), 0.001);
    }

    @Test(expected = WrongOperandException.class)
    public void testCalculate_illegalOperation() throws WrongOperandException {
        when(om.get('-')).thenReturn(null);

        modernCalculator.calculate(4, 5, '-');
    }
}
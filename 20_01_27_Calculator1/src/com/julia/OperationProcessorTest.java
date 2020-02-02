package com.julia;
import com.julia.calculator.ICalculator;
import com.julia.calculator.WrongOperandException;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OperationProcessorTest {

    ICalculator calculator;
    OperationProcessor op;


    @Before
    public void init() {
        calculator = mock(ICalculator.class);
        op = new OperationProcessor(calculator);

    }


    @Test
    void processStrings_legalLine_returnsMultiplication() throws WrongOperandException {
        String line = "2.5,*,2";
        when(calculator.calculate(2.5, 2, '*')).thenReturn(5.);

        String  expected = line + ",5.0";
        assertEquals(expected, op.processString(line));

    }

    @Test
    void processStrings_legalLine_WrongOperation_throwsWrongOperationExp() throws WrongOperandException {
        String line = "2.5,*,2";
        when(calculator.calculate(2.5, 2, '*')).thenThrow(WrongOperandException.class);

        String  expected = line + OperationProcessor.WRONG_OPERATION;
        assertEquals(expected, op.processString(line));

    }
}
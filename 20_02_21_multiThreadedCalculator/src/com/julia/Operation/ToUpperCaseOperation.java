package com.julia.Operation;

import com.julia.Operation.Operation;

public class ToUpperCaseOperation implements Operation {

    @Override
    public String operate(String operation) {
        String result = operation.toUpperCase();
        return  result;
    }
}

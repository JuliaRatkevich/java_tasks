package com.julia.Operation;

import com.julia.Operation.Operation;

public class ToLowerCaseOperation implements Operation {

    @Override
    public String operate(String operation) {
        String result = operation.toLowerCase();
        return  result;

    }
}

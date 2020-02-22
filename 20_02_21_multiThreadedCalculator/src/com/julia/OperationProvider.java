package com.julia;

import com.julia.Operation.Operation;

import java.util.Map;

public class OperationProvider {

    private Map<String, Operation> operationMap;

    public OperationProvider(Map<String, Operation> operationMap) {
        this.operationMap = operationMap;
    }

    public Operation getOperationByName(String operationName) {
        return operationMap.get(operationName);
    }
}
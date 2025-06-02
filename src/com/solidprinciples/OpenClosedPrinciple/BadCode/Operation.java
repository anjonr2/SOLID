package com.solidprinciples.OpenClosedPrinciple.BadCode;

public class Operation {
    public double calculate(String operation, int a, int b){
        if (operation == null || operation.isEmpty()){
            throw new IllegalArgumentException("Operation can not be null or empty");
        }
        switch (operation.toLowerCase()){
            case "addition":
                return a + b;
            case "subtraction":
                return a - b;
            case "multiplication":
                return a * b;
            default:
                throw new UnsupportedOperationException("Operation not supported: " + operation);
        }
    }
}

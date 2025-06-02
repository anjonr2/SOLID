package com.solidprinciples.OpenClosedPrinciple.GoodCode;

public class Calculator {
    public double calculate(Operation operation){
        if (operation == null){
            throw new IllegalArgumentException("Operation can not be null");
        }
        return operation.calculate();
    }
}

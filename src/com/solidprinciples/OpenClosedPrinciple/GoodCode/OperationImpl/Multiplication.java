package com.solidprinciples.OpenClosedPrinciple.GoodCode.OperationImpl;

import com.solidprinciples.OpenClosedPrinciple.GoodCode.Operation;

public class Multiplication implements Operation {
    private final int a;
    private final int b;

    public Multiplication(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        return a * b;
    }
}

package com.solidprinciples.OpenClosedPrinciple.GoodCode.OperationImpl;

import com.solidprinciples.OpenClosedPrinciple.GoodCode.Operation;

public class Subtraction implements Operation {
    private final int a;
    private final int b;

    public Subtraction(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(){
        return a - b;
    }
}

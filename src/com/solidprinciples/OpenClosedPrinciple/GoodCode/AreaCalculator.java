package com.solidprinciples.OpenClosedPrinciple.GoodCode;

public class AreaCalculator {
    public double calculateArea(Shape shape){
        if(shape == null){
            throw new IllegalArgumentException("Shape cannot be null");
        }
        return shape.calculateArea();
    }
}

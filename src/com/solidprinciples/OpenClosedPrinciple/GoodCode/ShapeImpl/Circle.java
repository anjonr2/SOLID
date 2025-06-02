package com.solidprinciples.OpenClosedPrinciple.GoodCode.ShapeImpl;

import com.solidprinciples.OpenClosedPrinciple.GoodCode.Shape;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}

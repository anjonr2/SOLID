package com.solidprinciples.OpenClosedPrinciple.GoodCode.ShapeImpl;

import com.solidprinciples.OpenClosedPrinciple.GoodCode.Shape;
import org.w3c.dom.css.Rect;

public class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width= width;
    }

    @Override
    public double calculateArea(){
        return length*width;
    }
}

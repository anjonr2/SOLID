package com.solidprinciples.OpenClosedPrinciple.GoodCode;

import com.solidprinciples.OpenClosedPrinciple.GoodCode.ShapeImpl.Circle;
import com.solidprinciples.OpenClosedPrinciple.GoodCode.ShapeImpl.Rectangle;

public class Main {
    public static void main(String []args){
        Shape circle = new Circle(4.0);
        Shape rectangle = new Rectangle(2.0,3.0);
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Area of Circle: "+ areaCalculator.calculateArea(circle));
        System.out.println("Area of rectangle: "+areaCalculator.calculateArea(rectangle));
    }
}

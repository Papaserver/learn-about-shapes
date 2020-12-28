package com.codecool.geometry.shapes;

import java.text.DecimalFormat;

public class Circle extends Shape {

    private double r = 4.00;

    @Override
    public double calculateArea() {
        double circleArea = Math.pow(r, 2)*Math.PI;
        double rounded = Math.floor(circleArea * 100) / 100;
        return rounded;
    }

    @Override
    public double calculatePerimeter() {
        double circlePerimeter = 2*r*Math.PI;
        double rounded = Math.floor(circlePerimeter * 100) / 100;
        return rounded;
    }

    public String toString() {
        String shapeName = "Circle";
        return shapeName+", "+"r = "+String.valueOf(r);
    }
}

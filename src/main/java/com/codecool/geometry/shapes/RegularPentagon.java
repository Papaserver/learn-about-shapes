package com.codecool.geometry.shapes;

public class RegularPentagon extends Shape {

    private double a = 5.00;

    @Override
    public double calculateArea() {
        double pentagonArea = a*a*Math.sqrt(5*(5+2*Math.sqrt(5)))/4;
        double rounded = Math.floor(pentagonArea * 100) / 100;
        return rounded;
    }

    @Override
    public double calculatePerimeter() {
        double pentagonPerimeter = 5*a;
        double rounded = Math.floor(pentagonPerimeter * 100) / 100;
        return rounded;
    }

    public String toString() {
        String shapeName = "Regular Pentagon";
        return shapeName+", "+"a = "+String.valueOf(a);
    }
}

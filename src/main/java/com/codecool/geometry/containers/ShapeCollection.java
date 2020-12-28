package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Shape;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;

import java.util.ArrayList;

public class ShapeCollection {

    ArrayList<String> shapes = new ArrayList<>();

    Circle circle = new Circle();
    EquilateralTriangle eLatTrian = new EquilateralTriangle();
    Rectangle rectangle = new Rectangle();
    RegularPentagon regularPentagon = new RegularPentagon();
    Square square = new Square();
    Triangle triangle = new Triangle();

    public ShapeCollection() {

        shapes.add("Circle");
        shapes.add("Equilateral Triangle");
        shapes.add("Rectangle");
        shapes.add("Regular Pentagon");
        shapes.add("Square");
        shapes.add("Triangle");

    }

    public void addShape(String shapeToAdd) {

        shapes.add(shapeToAdd);
    }

    public ArrayList<String> getShapes() {
        return shapes;
    }

    public void getShapesTable() {


        System.out.println("/------------------------------------------------------------------------------------------------------------------------------------\\");
        System.out.println("| ID|                Class|                                toString|  Perimeter|   Formula|       Area|                       Formula|");
        System.out.println("|---|---------------------|----------------------------------------|-----------|----------|-----------|------------------------------|");
        System.out.println("|  0|               Circle|                         "+circle.toString()+"|      "+circle.calculatePerimeter()+"|     2×π×r|      "+circle.calculateArea()+"|                         π×r×r|");
        System.out.println("|---|---------------------|----------------------------------------|-----------|----------|-----------|------------------------------|");
        System.out.println("|  1|            Rectangle|             "+rectangle.toString()+"|       "+rectangle.calculatePerimeter()+"|   2×a+2×b|       "+rectangle.calculateArea()+"|                           a×b|");
        System.out.println("|---|---------------------|----------------------------------------|-----------|----------|-----------|------------------------------|");
        System.out.println("|  2|             Triangle|     "+triangle.toString()+"|       "+triangle.calculatePerimeter()+"|     a+b+c|      "+triangle.calculateArea()+"|     sqrt(s×(s-a)×(s-b)×(s-c))|");
        System.out.println("|---|---------------------|----------------------------------------|-----------|----------|-----------|------------------------------|");
        System.out.println("|  3|               Square|                        "+square.toString()+"|       "+square.calculatePerimeter()+"|       4×a|      "+square.calculateArea()+"|                           a×a|");
        System.out.println("|---|---------------------|----------------------------------------|-----------|----------|-----------|------------------------------|");
        System.out.println("|  4|  EquilateralTriangle|           "+eLatTrian.toString()+"|        "+eLatTrian.calculatePerimeter()+"|       3×a|       "+eLatTrian.calculateArea()+"|                 a×a×sqrt(3)/4|");
        System.out.println("|---|---------------------|----------------------------------------|-----------|----------|-----------|------------------------------|");
        System.out.println("|  5|      RegularPentagon|               "+regularPentagon.toString()+"|       "+regularPentagon.calculatePerimeter()+"|       5×a|      "+regularPentagon.calculateArea()+"|    a×a×sqrt(5×(5+2×sqrt(5))/4|");
        System.out.println("\\------------------------------------------------------------------------------------------------------------------------------------/");
    }

    public String getLargestShapeByPerimeter() {
        ArrayList<Double> shapePerimeters = new ArrayList<>();
        shapePerimeters.add(circle.calculatePerimeter());
        shapePerimeters.add(eLatTrian.calculatePerimeter());
        shapePerimeters.add(rectangle.calculatePerimeter());
        shapePerimeters.add(regularPentagon.calculatePerimeter());
        shapePerimeters.add(square.calculatePerimeter());
        shapePerimeters.add(triangle.calculatePerimeter());

        double largestPerimeter = 0;
        String shapeWithLargestPerimeter = "";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapePerimeters.get(i)>largestPerimeter) {
                largestPerimeter = shapePerimeters.get(i);
                shapeWithLargestPerimeter = shapes.get(i);
            }
        }
        return shapeWithLargestPerimeter;
    }
    public String getLargestShapeByArea() {
        ArrayList<Double> shapePerimeters = new ArrayList<>();
        shapePerimeters.add(circle.calculateArea());
        shapePerimeters.add(eLatTrian.calculateArea());
        shapePerimeters.add(rectangle.calculateArea());
        shapePerimeters.add(regularPentagon.calculateArea());
        shapePerimeters.add(square.calculateArea());
        shapePerimeters.add(triangle.calculateArea());

        double largestArea = 0;
        String shapeWithLargestArea = "";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapePerimeters.get(i)>largestArea) {
                largestArea = shapePerimeters.get(i);
                shapeWithLargestArea = shapes.get(i);
            }
        }
        return shapeWithLargestArea;
    }
}

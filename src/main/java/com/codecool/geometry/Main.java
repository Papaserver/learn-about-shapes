package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;
import com.codecool.geometry.utilities.FormulaProvider;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("0 - Exit");
            System.out.println("1 - Add new shape");
            System.out.println("2 - Show all shapes");
            System.out.println("3 - Show shape with the largest perimeter");
            System.out.println("4 - Show shape with the largest area");
            System.out.println("5 - Show formulas");
            System.out.println("Please type the menu number you want to select!");

	        int option = input.nextInt();
            ShapeCollection shapeCollection = new ShapeCollection();
            switch (option) {
                case 1:
                    Scanner userInput = new Scanner(System.in);
                    System.out.println("Please type the shape you want to add!");
                    String newShape = userInput.nextLine();
                    shapeCollection.addShape(newShape);
                    System.out.println(shapeCollection.getShapes());
                    break;
                case 2:
                    System.out.println(shapeCollection.getShapes());
                    break;
                case 3:
                    System.out.println(shapeCollection.getLargestShapeByPerimeter());
                    break;
                case 4:
                    System.out.println(shapeCollection.getLargestShapeByArea());
                    break;
                case 5:

                    System.out.println("1 - Circle");
                    System.out.println("2 - Equilateral Triangle");
                    System.out.println("3 - Rectangle");
                    System.out.println("4 - Regular Pentagon");
                    System.out.println("5 - Square");
                    System.out.println("6 - Triangle");
                    System.out.println("Please select the shape!");
                    FormulaProvider formula = new FormulaProvider();
                    Scanner number = new Scanner(System.in);
                    int shapeNumber = number.nextInt();
                    System.out.println(formula.getAreaForShape(shapeNumber)+", "+formula.getPerimeterForShape(shapeNumber));
                    break;
                case 0:
                    isRunning = false;
                    break;
            }
        }
    }

}

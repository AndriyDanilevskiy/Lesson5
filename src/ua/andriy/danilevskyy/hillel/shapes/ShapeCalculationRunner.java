package ua.andriy.danilevskyy.hillel.shapes;

import ua.andriy.danilevskyy.hillel.shapes.models.*;

import java.util.List;

import static ua.andriy.danilevskyy.hillel.shapes.utils.AreaCalculator.calculateTotalArea;

public class ShapeCalculationRunner {
    public static void main(String[] args) {

        Square square = new Square(10);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(17, 3);

        System.out.println("Square area: " + square.getAria());
        System.out.println("Circle area: " + circle.getAria());
        System.out.println("triangle area: " + triangle.getAria());

        List<Measurable> shapeList = List.of(
                new Square(10),
                new Circle(2),
                new Triangle(17, 3),
                new Square(15),
                new Circle(34)
        );
        System.out.println("Total area of all shapes is: " + calculateTotalArea(shapeList));
    }
}

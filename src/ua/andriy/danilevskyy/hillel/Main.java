package ua.andriy.danilevskyy.hillel;

import ua.andriy.danilevskyy.hillel.shapes.models.Circle;
import ua.andriy.danilevskyy.hillel.shapes.models.Square;
import ua.andriy.danilevskyy.hillel.shapes.models.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(17, 3);

        System.out.println("Square area: " + square.getAria());
        System.out.println("Circle area: " + circle.getAria());
        System.out.println("triangle area: " + triangle.getAria());
    }
}

package ua.andriy.danilevskyy.hillel;

import ua.andriy.danilevskyy.hillel.competition.models.*;
import ua.andriy.danilevskyy.hillel.shapes.models.*;

import java.util.List;

import static ua.andriy.danilevskyy.hillel.shapes.utils.AreaCalculator.calculateTotalArea;

public class Main {
    public static void main(String[] args) {
        //Shapes
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


        //Super Random Sport Event
        List<Participant> participants = List.of(
                new Man("Andy", (int) (Math.random() * 100), (int) (Math.random() * 10)),
                new Cat("Murzik", (int) (Math.random() * 100), (int) (Math.random() * 10)),
                new Robot("Ron", (int) (Math.random() * 100), (int) (Math.random() * 10))
        );

        List<Obstacle> obstacles = List.of(
                new Track((int) (Math.random() * 100)),
                new Wall((int) (Math.random() * 10)),
                new Wall((int) (Math.random() * 10)),
                new Track((int) (Math.random() * 100))
        );

        Competition competition = new Competition();
        competition.startCompetition(participants, obstacles);
    }
}

package ua.andriy.danilevskyy.hillel.shapes.utils;

import ua.andriy.danilevskyy.hillel.shapes.model.Measurable;

import java.util.List;

public class AreaCalculator {
    public static double calculateTotalArea(List<Measurable> shapeList) {
        double totalArea = 0;
        for (Measurable shape : shapeList) {
            totalArea += shape.getAria();
        }
        return totalArea;
    }
}

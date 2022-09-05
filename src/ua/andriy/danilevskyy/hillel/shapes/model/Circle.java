package ua.andriy.danilevskyy.hillel.shapes.model;

public class Circle implements Measurable {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getAria() {
        return Math.PI * (Math.pow(radius, 2));
    }
}

package ua.andriy.danilevskyy.hillel.shapes.model;

public class Triangle implements Measurable {
    private final int baseSide;
    private final int height;

    public Triangle(int baseSide, int height) {
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double getAria() {
        return (baseSide * height) / 2;
    }
}

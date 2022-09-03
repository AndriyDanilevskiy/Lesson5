package ua.andriy.danilevskyy.hillel.shapes.model;

public class Square implements Measurable {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getAria() {
        return side * side;
    }
}
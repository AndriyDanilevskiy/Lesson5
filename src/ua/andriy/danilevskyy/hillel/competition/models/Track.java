package ua.andriy.danilevskyy.hillel.competition.models;

public class Track extends Obstacle {
    private final String name = "Track";
    private final int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDistance() {
        return distance;
    }

    @Override
    public boolean overcome(int limit) {
        return distance <= limit;
    }
}

package ua.andriy.danilevskyy.hillel.competition.models.obstacles;

public class Wall extends Obstacle {
    private final String name = "Wall";
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public boolean overcome(int limit) {
        return height <= limit;
    }
}

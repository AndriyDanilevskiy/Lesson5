package ua.andriy.danilevskyy.hillel.competition.models.participants;

public abstract class Participant {
    protected String name;
    protected int runLimit;
    protected int jumpLimit;

    public String getName() {
        return name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public void run() {
        System.out.println(name + "' is running!");
    }

    public void jump() {
        System.out.println(name + " jumps!");
    }
}

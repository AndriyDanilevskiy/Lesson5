package ua.andriy.danilevskyy.hillel.competition.models.participants;

public class Cat extends Participant {
    public Cat(String name, int runLimit, int jumpLimit) {
        super.name = name;
        super.runLimit = runLimit;
        super.jumpLimit = jumpLimit;
    }

    public String getName() {
        return name;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }
}

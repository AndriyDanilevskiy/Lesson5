package ua.andriy.danilevskyy.hillel.competition;

import ua.andriy.danilevskyy.hillel.competition.event.Competition;
import ua.andriy.danilevskyy.hillel.competition.models.obstacles.Obstacle;
import ua.andriy.danilevskyy.hillel.competition.models.obstacles.Track;
import ua.andriy.danilevskyy.hillel.competition.models.obstacles.Wall;
import ua.andriy.danilevskyy.hillel.competition.models.participants.Cat;
import ua.andriy.danilevskyy.hillel.competition.models.participants.Man;
import ua.andriy.danilevskyy.hillel.competition.models.participants.Participant;
import ua.andriy.danilevskyy.hillel.competition.models.participants.Robot;

import java.util.List;

public class EventRunner {
    public static void main(String[] args) {

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

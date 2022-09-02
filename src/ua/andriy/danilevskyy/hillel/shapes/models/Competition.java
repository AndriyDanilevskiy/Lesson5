package ua.andriy.danilevskyy.hillel.shapes.models;

import ua.andriy.danilevskyy.hillel.competition.models.*;

import java.util.List;

public class Competition {
    public void startCompetition(List<Participant> participants, List<Obstacle> obstacles) {
        System.out.println("Lets the Competition begin!");
        for (Participant participant : participants) {
            System.out.println(participant.getName() + " begins!");

            int participantActionLimit;
            String positiveResultMessage;
            String negativeResultMessage;
            for (int i = 0; i < obstacles.size(); i++) {
                Obstacle obstacle = obstacles.get(i);
                if (obstacle instanceof Track) {
                    participantActionLimit = participant.getRunLimit();
                    positiveResultMessage = participant.getName() + " passed the " + obstacle.getName() + " with "
                            + obstacle.getDistance() + " meters of distance!";
                    negativeResultMessage = participant.getName() + " stopped on " + participant.getJumpLimit() +
                            " meter of distance.";
                    System.out.println("There is a " + obstacle.getDistance() + " meters " + obstacle.getName() + "!");
                    participant.run();
                } else {
                    participantActionLimit = participant.getJumpLimit();
                    positiveResultMessage = participant.getName() + " passed the " + obstacle.getName() + " with "
                            + obstacle.getHeight() + " meters of height!";
                    negativeResultMessage = participant.getName() + " couldn't jump more than "
                            + participant.getJumpLimit() + " meters.";
                    System.out.println("Now there is a " + obstacle.getHeight() + " meters " + obstacle.getName() + "!");
                    participant.jump();
                }
                if (!obstacle.overcome(participantActionLimit)) {
                    System.out.println(negativeResultMessage);
                    System.out.println("So, this is the end for " + participant.getName());
                    break;
                } else {
                    System.out.println(positiveResultMessage);
                    if (i == obstacles.size() - 1) {
                        System.out.println(participant.getName() + " has successfully finished!");
                    }
                }
            }
        }
        System.out.println("The competition has been finished!");
    }

}

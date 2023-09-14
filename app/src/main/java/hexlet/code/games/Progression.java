package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Gaming;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Progression implements Gaming {

    private static final int MAX_MISSING_NUMBER_PLEASE = 9;
    private static final int MAX_STEP_PROGRESSION = 10;

    @Override
    public void makeGame() {
        Engine.setRule("What number is missing in the progression?");
        String answer;
        String question;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            StringBuilder progression = new StringBuilder();
            int fistNumberProgression = Utils.generateRandomNumber();
            int step = Utils.generateRandomNumber(1, MAX_STEP_PROGRESSION);
            int missingNumberPlace = Utils.generateRandomNumber(0, MAX_MISSING_NUMBER_PLEASE);

            for (int j = 0; j < missingNumberPlace; j++) {
                progression.append(fistNumberProgression).append(" ");
                fistNumberProgression += step;
            }

            progression.append(".. ");
            answer = String.valueOf(fistNumberProgression);
            fistNumberProgression += step;

            for (int j = missingNumberPlace; j < MAX_MISSING_NUMBER_PLEASE; j++) {
                progression.append(fistNumberProgression).append(" ");
                fistNumberProgression += step;
            }
            question = String.valueOf(progression);

            Engine.setRoundInfo(i, new RoundInfo(question, answer));
        }
    }
}

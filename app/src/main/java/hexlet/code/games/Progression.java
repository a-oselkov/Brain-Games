package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.roundInfo;

public class Progression {
    private static final String PROGRESSION_RULES = "What number is missing in the progression?";
    public static final int MAX_MISSING_NUMBER_PLEASE = 9;
    public static final int MAX_STEP_PROGRESSION = 10;

    public static void generateQuestionsAnswersForProgression() {
        String answer;
        String question;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            String progression = "";
            int fistNumberProgression = Utils.generateRandomNumber();
            int step = Utils.generateRandomNumber(1, MAX_STEP_PROGRESSION);
            int missingNumberPlace = Utils.generateRandomNumber(0, MAX_MISSING_NUMBER_PLEASE);

            for (int j = 0; j < missingNumberPlace; j++) {
                progression += fistNumberProgression + " ";
                fistNumberProgression += step;
            }

            progression += ".. ";
            answer = String.valueOf(fistNumberProgression);
            fistNumberProgression += step;

            for (int j = missingNumberPlace; j < MAX_MISSING_NUMBER_PLEASE; j++) {
                progression += fistNumberProgression + " ";
                fistNumberProgression += step;
            }

            question = progression;

            roundInfo[i] = new RoundInfo(question, answer);
        }
    }

    public static void playProgression() {
        Engine.playGame(PROGRESSION_RULES, roundInfo);
    }
}

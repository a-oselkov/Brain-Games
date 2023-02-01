package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Progression {
    private static final String PROGRESSION_RULES = "What number is missing in the progression?";
    public static final int MAX_MISSING_NUMBER_PLEASE = 9;
    public static final int MAX_STEP_PROGRESSION = 10;
    public static void playProgression() {
        String[] ANSWERQUESTION = new String[MAX_ROUNDS * 2];
        for (int i = 0; i < ANSWERQUESTION.length; i = i + 2) {

            int fistNumber = Utils.generateRandomNumber();
            int step = Utils.generateRandomNumber(1, MAX_STEP_PROGRESSION);
            int missingNumberPlace = Utils.generateRandomNumber(0, MAX_MISSING_NUMBER_PLEASE);
            String progression = "";

            progression += "Question: ";

            for (int j = 0; j < missingNumberPlace; j++) {
                progression += fistNumber + " ";
                fistNumber += step;
            }
            progression += ".. ";
            ANSWERQUESTION[i + 1] = String.valueOf(fistNumber);
            fistNumber += step;
            for (int j = missingNumberPlace; j < MAX_MISSING_NUMBER_PLEASE; j++) {
                progression += fistNumber + " ";
                fistNumber += step;
            }
            ANSWERQUESTION[i] = progression;
        }
        Engine.playProgress(PROGRESSION_RULES, ANSWERQUESTION);
    }
}

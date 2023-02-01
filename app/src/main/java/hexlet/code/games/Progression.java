package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.answerQuestion;
import static hexlet.code.games.Constants.MAX_MISSING_NUMBER_PLEASE;
import static hexlet.code.games.Constants.MAX_NUMBER;
import static hexlet.code.games.Constants.MAX_STEP_PROGRESSION;
import static hexlet.code.games.Constants.PROGRESSION_RULES;

public class Progression {
    public static void playProgression() {
        for (int i = 0; i < answerQuestion.length - 1; i = i + 2) {

            int fistNumber = Utils.generateRandomNumber(0, MAX_NUMBER);
            int step = Utils.generateRandomNumber(1, MAX_STEP_PROGRESSION);
            int missingNumberPlace = Utils.generateRandomNumber(0, MAX_MISSING_NUMBER_PLEASE);
            String progression = "";

            progression += "Question: ";

            for (int j = 0; j < missingNumberPlace; j++) {
                progression += fistNumber + " ";
                fistNumber += step;
            }
            progression += ".. ";
            answerQuestion[i + 1] = String.valueOf(fistNumber);
            fistNumber += step;
            for (int j = missingNumberPlace; j < MAX_MISSING_NUMBER_PLEASE; j++) {
                progression += fistNumber + " ";
                fistNumber += step;
            }
            answerQuestion[i] = progression;
        }
        Engine.playProgress(PROGRESSION_RULES);
    }
}

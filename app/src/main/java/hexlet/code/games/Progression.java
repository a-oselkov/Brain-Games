package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.games.Constants.MAX_MISSING_NUMBER_PLEASE;
import static hexlet.code.games.Constants.MAX_NUMBER;
import static hexlet.code.games.Constants.MAX_STEP_PROGRESSION;

public class Progression {
    public static String playProgression() {
        int fistNumber = Utils.generateRandomNumber(0, MAX_NUMBER);
        int step = Utils.generateRandomNumber(1, MAX_STEP_PROGRESSION);
        int missingNumberPlace = Utils.generateRandomNumber(0, MAX_MISSING_NUMBER_PLEASE);
        String correctAnswer;
        System.out.print("Question: ");
        for (int i = 0; i < missingNumberPlace; i++) {
            System.out.print(fistNumber + " ");
            fistNumber += step;
        }
        System.out.print(".. ");
        correctAnswer = String.valueOf(fistNumber);
        fistNumber += step;
        for (int i = missingNumberPlace; i < MAX_MISSING_NUMBER_PLEASE; i++) {
            System.out.print(fistNumber + " ");
            fistNumber += step;
        }
        System.out.println(" ");
        return correctAnswer;
    }
}

package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {
    public static String playProgression() {
        int fistNumber = Utils.generateRandomNumber(0, Constants.MAX_NUMBER);
        int step = Utils.generateRandomNumber(1, Constants.MAX_STEP_PROGRESSION);
        int missingNumberPlace = Utils.generateRandomNumber(0, Constants.MAX_MISSING_NUMBER_PLASE);
        String correctAnswer;
        System.out.print("Question: ");
        for (int i = 0; i < missingNumberPlace; i++) {
            System.out.print(fistNumber + " ");
            fistNumber += step;
        }
        System.out.print(".. ");
        correctAnswer = String.valueOf(fistNumber);
        fistNumber += step;
        for (int i = missingNumberPlace; i < Constants.MAX_MISSING_NUMBER_PLASE; i++) {
            System.out.print(fistNumber + " ");
            fistNumber += step;
        }
        System.out.println(" ");
        return correctAnswer;
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Progression {
    private static final String PROGRESSION_RULES = "What number is missing in the progression?";
    public static final int MAX_MISSING_NUMBER_PLEASE = 9;
    public static final int MAX_STEP_PROGRESSION = 10;
    private static String[] generateRoundQuestion() {
        String answer;
        String question;
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
        String[] questionAnswerRound = {question, answer};
        return questionAnswerRound;
    }
    private static String[][] generateGameQuestion() {
        String[][] questionAnswerGame = new String[MAX_ROUNDS][2];
        String[] questionAnswerRound;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            questionAnswerRound = generateRoundQuestion();
            questionAnswerGame[i][0] = questionAnswerRound[0];
            questionAnswerGame[i][1] = questionAnswerRound[1];
        }
        return questionAnswerGame;
    }
    public static void playProgression() {
        Engine.playGame(PROGRESSION_RULES, generateGameQuestion());
    }

}

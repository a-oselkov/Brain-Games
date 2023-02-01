package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Constants.MAX_NUMBER;
import static hexlet.code.Engine.MAX_ROUNDS;

public class Even {
    private static final String EVEN_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final String[] ANSWERQUESTION = new String[MAX_ROUNDS * 2];
    public static void playEven() {
        for (int i = 0; i < ANSWERQUESTION.length; i = i + 2) {
            int number = Utils.generateRandomNumber(0, MAX_NUMBER);
            ANSWERQUESTION[i] = "Question: " + number;
            if (number % 2 == 0) {
                ANSWERQUESTION[i + 1] = "yes";
            } else {
                ANSWERQUESTION[i + 1] = "no";
            }
        }
        Engine.playProgress(EVEN_RULES, ANSWERQUESTION);
    }
}

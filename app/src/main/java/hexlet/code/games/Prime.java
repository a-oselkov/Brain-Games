package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Constants.MAX_NUMBER;
import static hexlet.code.Engine.MAX_ROUNDS;

public class Prime {
    private static final String PRIME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final String[] ANSWERQUESTION = new String[MAX_ROUNDS * 2];
    public static void playPrime() {
        for (int i = 0; i < ANSWERQUESTION.length; i = i + 2) {

            int number = Utils.generateRandomNumber(0, MAX_NUMBER);

            ANSWERQUESTION[i] = "Question: " + number;
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    ANSWERQUESTION[i + 1] = "no";
                    break;
                } else {
                    ANSWERQUESTION[i + 1] = "yes";
                }
            }
        }
        Engine.playProgress(PRIME_RULES, ANSWERQUESTION);
    }
}

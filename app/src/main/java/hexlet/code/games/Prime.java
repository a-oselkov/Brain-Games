package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.answerQuestion;
import static hexlet.code.games.Constants.MAX_NUMBER;
import static hexlet.code.games.Constants.PRIME_RULES;

public class Prime {
    public static void playPrime() {
        for (int i = 0; i < answerQuestion.length - 1; i = i + 2) {

            int number = Utils.generateRandomNumber(0, MAX_NUMBER);

            answerQuestion[i] = "Question: " + number;
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    answerQuestion[i + 1] = "no";
                    break;
                } else {
                    answerQuestion[i + 1] = "yes";
                }
            }
        }
        Engine.playProgress(PRIME_RULES);
    }
}

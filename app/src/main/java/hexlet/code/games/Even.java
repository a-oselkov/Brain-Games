package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.answerQuestion;
import static hexlet.code.games.Constants.EVEN_RULES;
import static hexlet.code.games.Constants.MAX_NUMBER;

public class Even {
    public static void playEven() {
        for (int i = 0; i < answerQuestion.length - 1; i = i + 2) {
            int number = Utils.generateRandomNumber(0, MAX_NUMBER);
            answerQuestion[i] = "Question: " + number;
            if (number % 2 == 0) {
                answerQuestion[i + 1] = "yes";
            } else {
                answerQuestion[i + 1] = "no";
            }
        }
        Engine.playProgress(EVEN_RULES);
    }
}

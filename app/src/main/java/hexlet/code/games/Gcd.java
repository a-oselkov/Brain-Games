package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.answerQuestion;
import static hexlet.code.games.Constants.GCD_RULES;
import static hexlet.code.games.Constants.MAX_NUMBER;
public class Gcd {
    public static void playGcd() {
        for (int i = 0; i < answerQuestion.length - 1; i = i + 2) {

            int number1 = Utils.generateRandomNumber(0, MAX_NUMBER);
            int number2 = Utils.generateRandomNumber(1, MAX_NUMBER);

            answerQuestion[i] = "Question: " + number1 + " " + number2;

            while (number2 > 0) {
                int temp = number1 % number2;
                number1 = number2;
                number2 = temp;
            }
            answerQuestion[i + 1] = String.valueOf(number1);
        }
        Engine.playProgress(GCD_RULES);
    }
}

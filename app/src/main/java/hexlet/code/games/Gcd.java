package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Constants.MAX_NUMBER;
import static hexlet.code.Engine.MAX_ROUNDS;

public class Gcd {
    private static final String GCD_RULES = "Find the greatest common divisor of given numbers.";
    private static final String[] ANSWERQUESTION = new String[MAX_ROUNDS * 2];
    public static void playGcd() {
        for (int i = 0; i < ANSWERQUESTION.length; i = i + 2) {

            int number1 = Utils.generateRandomNumber(0, MAX_NUMBER);
            int number2 = Utils.generateRandomNumber(1, MAX_NUMBER);

            ANSWERQUESTION[i] = "Question: " + number1 + " " + number2;

            while (number2 > 0) {
                int temp = number1 % number2;
                number1 = number2;
                number2 = temp;
            }
            ANSWERQUESTION[i + 1] = String.valueOf(number1);
        }
        Engine.playProgress(GCD_RULES, ANSWERQUESTION);
    }
}

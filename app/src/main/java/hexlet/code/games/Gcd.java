package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Gcd {
    private static final String GCD_RULES = "Find the greatest common divisor of given numbers.";
    public static void playGcd() {
        String[] questions = new String[MAX_ROUNDS];
        String[] answers = new String[MAX_ROUNDS];
        for (int i = 0; i < MAX_ROUNDS; i++) {

            int number1 = Utils.generateRandomNumber();
            int number2 = Utils.generateRandomNumber();

            questions[i] = number1 + " " + number2;

            while (number2 > 0) {
                int temp = number1 % number2;
                number1 = number2;
                number2 = temp;
            }
            answers[i] = String.valueOf(number1);
        }
        Engine.playProgress(GCD_RULES, questions, answers);
    }
}

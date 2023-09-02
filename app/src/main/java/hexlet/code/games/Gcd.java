package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.roundInfo;

public class Gcd {
    private static final String GCD_RULES = "Find the greatest common divisor of given numbers.";

    public static void generateQuestionsAnswersForGcd() {
        String answer;
        String question;
        int number1;
        int number2;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            number1 = Utils.generateRandomNumber();
            number2 = Utils.generateRandomNumber();
            question = number1 + " " + number2;

            while (number2 > 0) {
                int temp = number1 % number2;
                number1 = number2;
                number2 = temp;
            }
            answer = String.valueOf(number1);
            roundInfo[i] = new RoundInfo(question, answer);
        }
    }

    public static void playGcd() {
        Engine.playGame(GCD_RULES, roundInfo);
    }
}

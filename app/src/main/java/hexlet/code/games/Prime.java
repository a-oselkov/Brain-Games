package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Prime {
    private static final String PRIME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void playPrime() {
        String[] questions = new String[MAX_ROUNDS];
        String[] answers = new String[MAX_ROUNDS];
        for (int i = 0; i < MAX_ROUNDS; i++) {

            int number = Utils.generateRandomNumber();

            questions[i] = String.valueOf(number);
            answers[i] = "yes";
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    answers[i] = "no";
                    break;
                }
            }
        }
        Engine.playProgress(PRIME_RULES, questions, answers);
    }
}

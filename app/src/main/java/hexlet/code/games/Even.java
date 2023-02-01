package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Even {
    private static final String EVEN_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void playEven() {
        String[] questions = new String[MAX_ROUNDS];
        String[] answers = new String[MAX_ROUNDS];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            int number = Utils.generateRandomNumber();
            questions[i] = String.valueOf(number);
            if (number % 2 == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        Engine.playProgress(EVEN_RULES, questions, answers);
    }
}

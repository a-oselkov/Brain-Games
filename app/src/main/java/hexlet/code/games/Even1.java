package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Even1 {
    private static final String EVEN_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String answer;
    private static String question;
    private static void generateRound() {
        int number = Utils.generateRandomNumber();
        question = String.valueOf(number);
        if (number % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }
    }
    public static void playEven() {
        String[] questions = new String[MAX_ROUNDS];
        String[] answers = new String[MAX_ROUNDS];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            generateRound();
            questions[i] = question;
            answers[i] = answer;
        }
        Engine.playProgress(EVEN_RULES, questions, answers);
    }
}
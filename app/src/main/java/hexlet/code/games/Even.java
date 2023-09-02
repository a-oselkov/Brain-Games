package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.roundInfo;

public class Even {
    private static final String EVEN_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void generateQuestionsAnswersForEven() {
        String answer;
        String question;
        int number;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            number = Utils.generateRandomNumber();
            question = String.valueOf(number);
            if (number % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            roundInfo[i] = new RoundInfo(question, answer);
        }
    }

    public static void playEven() {
        Engine.playGame(EVEN_RULES, roundInfo);
    }
}


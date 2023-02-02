package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Even {
    private static final String EVEN_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static String[] generateRoundQuestion() {
        String answer;
        String question;
        int number = Utils.generateRandomNumber();
        question = String.valueOf(number);
        if (number % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }
        String[] questionAnswerRound = {question, answer};
        return questionAnswerRound;
    }
    private static String[][] generateGameQuestion() {
        String[][] questionAnswerGame = new String[MAX_ROUNDS][2];
        String[] questionAnswerRound;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            questionAnswerRound = generateRoundQuestion();
            for (int j = 0; j < 2; j++) {
                questionAnswerGame[i][j] = questionAnswerRound[j];
            }
        }
        return questionAnswerGame;
    }
    public static void playEven() {
        Engine.playGame(EVEN_RULES, generateGameQuestion());
    }
}


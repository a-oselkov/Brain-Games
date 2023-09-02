package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Even {
    private static final String EVEN_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static RoundInfo generateRoundQuestion() {
        String answer;
        String question;
        int number = Utils.generateRandomNumber();
        question = String.valueOf(number);
        if (number % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }
        RoundInfo questionAnswer = new RoundInfo(question, answer);
        return questionAnswer;
    }
    private static RoundInfo[] generateGameQuestion() {
        RoundInfo[] questionAnswerGame = new RoundInfo[MAX_ROUNDS];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            questionAnswerGame[i] = generateRoundQuestion();
        }
        return questionAnswerGame;
    }
    public static void playEven() {
        Engine.playGame(EVEN_RULES, generateGameQuestion());
    }
}


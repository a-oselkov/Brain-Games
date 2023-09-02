package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Prime {
    private static final String PRIME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static RoundInfo generateRoundQuestion() {
        String answer;
        String question;
        int number = Utils.generateRandomNumber(1, Utils.MAX_NUMBER);
        question = String.valueOf(number);
        answer = "yes";
        if (number == 1) {
            answer = "no";
        }
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                answer = "no";
                break;
            }
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
    public static void playPrime() {
        Engine.playGame(PRIME_RULES, generateGameQuestion());
    }
}

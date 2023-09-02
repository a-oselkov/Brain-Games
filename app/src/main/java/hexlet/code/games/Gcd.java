package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Gcd {
    private static final String GCD_RULES = "Find the greatest common divisor of given numbers.";
    private static RoundInfo generateRoundQuestion() {
        String answer;
        String question;
        int number1 = Utils.generateRandomNumber();
        int number2 = Utils.generateRandomNumber();
        question = number1 + " " + number2;

        while (number2 > 0) {
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        answer = String.valueOf(number1);
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
    public static void playGcd() {
        Engine.playGame(GCD_RULES, generateGameQuestion());
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Gcd {
    private static final String GCD_RULES = "Find the greatest common divisor of given numbers.";
    private static String[] generateRoundQuestion() {
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
        String[] questionAnswerRound = {question, answer};
        return questionAnswerRound;
    }
    private static String[][] generateGameQuestion() {
        String[][] questionAnswerGame = new String[MAX_ROUNDS][2];
        String[] questionAnswerRound;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            questionAnswerRound = generateRoundQuestion();
            System.arraycopy(questionAnswerRound, 0, questionAnswerGame[i], 0, 2);
        }
        return questionAnswerGame;
    }
    public static void playGcd() {
        Engine.playGame(GCD_RULES, generateGameQuestion());
    }
}

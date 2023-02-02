package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Calc {
    private static final String CALC_RULES = "What is the result of the expression?";
    private static String[] generateRoundQuestion() {
        String answer;
        String question;
        int number1 = Utils.generateRandomNumber();
        int number2 = Utils.generateRandomNumber();
        String operation = String.valueOf(Utils.generateRandomNumber(0, 2));

        switch (operation) {
            case "1":
                question = number1 + " + " + number2;
                answer = String.valueOf(number1 + number2);
                break;
            case "2":
                question = number1 + " - " + number2;
                answer = String.valueOf(number1 - number2);
                break;
            default:
                question = number1 + " * " + number2;
                answer = String.valueOf(number1 * number2);
                break;
        }
        String[] questionAnswerRound = {question, answer};
        return questionAnswerRound;
    }
    private static String[][] generateGameQuestion(String[] questionAnswerRound) {
        String[][] questionAnswerGame = new String[MAX_ROUNDS][2];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            questionAnswerRound = generateRoundQuestion();
            questionAnswerGame[i][0] = questionAnswerRound[0];
            questionAnswerGame[i][1] = questionAnswerRound[1];
        }
        return questionAnswerGame;
    }
    public static void playCalc() {
        Engine.playGame(CALC_RULES, generateGameQuestion(generateRoundQuestion()));
    }
}

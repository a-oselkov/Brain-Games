package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.roundInfo;

public class Calc {
    private static final String CALC_RULES = "What is the result of the expression?";

    public static void generateQuestionsAnswersForCalc() {
        String answer;
        String question;
        int number1;
        int number2;
        String operation;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            number1 = Utils.generateRandomNumber();
            number2 = Utils.generateRandomNumber();
            operation = String.valueOf(Utils.generateRandomNumber(0, 2));

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
            roundInfo[i] = new RoundInfo(question, answer);
        }
    }

    public static void playCalc() {
        Engine.playGame(CALC_RULES, roundInfo);
    }
}


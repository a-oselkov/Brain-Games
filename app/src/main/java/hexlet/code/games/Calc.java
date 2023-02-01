package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.answerQuestion;
import static hexlet.code.games.Constants.CALC_RULES;
import static hexlet.code.games.Constants.MAX_NUMBER;

public class Calc {
    public static void playCalc() {
        for (int i = 0; i < answerQuestion.length - 1; i = i + 2) {

            int number1 = Utils.generateRandomNumber(0, MAX_NUMBER);
            int number2 = Utils.generateRandomNumber(0, MAX_NUMBER);
            int operation = Utils.generateRandomNumber(0, 2);

            switch (operation) {
                case 1:
                    answerQuestion[i] = "Question: " + number1 + " + " + number2;
                    answerQuestion[i + 1] = String.valueOf(number1 + number2);
                case 2:
                    answerQuestion[i] = "Question: " + number1 + " - " + number2;
                    answerQuestion[i + 1] = String.valueOf(number1 - number2);
                default:
                    answerQuestion[i] = "Question: " + number1 + " * " + number2;
                    answerQuestion[i + 1] = String.valueOf(number1 * number2);
            }
        }
        Engine.playProgress(CALC_RULES);
    }
}

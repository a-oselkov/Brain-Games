package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Calc {
    private static final String CALC_RULES = "What is the result of the expression?";
    private static final String[] ANSWERQUESTION = new String[MAX_ROUNDS * 2];
    public static void playCalc() {
        for (int i = 0; i < ANSWERQUESTION.length; i = i + 2) {

            int number1 = Utils.generateRandomNumber();
            int number2 = Utils.generateRandomNumber();
            int operation = Utils.generateRandomNumber(0, 2);

            switch (operation) {
                case 1:
                    ANSWERQUESTION[i] = "Question: " + number1 + " + " + number2;
                    ANSWERQUESTION[i + 1] = String.valueOf(number1 + number2);
                case 2:
                    ANSWERQUESTION[i] = "Question: " + number1 + " - " + number2;
                    ANSWERQUESTION[i + 1] = String.valueOf(number1 - number2);
                default:
                    ANSWERQUESTION[i] = "Question: " + number1 + " * " + number2;
                    ANSWERQUESTION[i + 1] = String.valueOf(number1 * number2);
            }
        }
        Engine.playProgress(CALC_RULES, ANSWERQUESTION);
    }
}

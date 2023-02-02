package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Calc {
    private static final String CALC_RULES = "What is the result of the expression?";
    public static void playCalc() {
        String[] questions = new String[MAX_ROUNDS];
        String[] answers = new String[MAX_ROUNDS];
        for (int i = 0; i < MAX_ROUNDS; i++) {

            int number1 = Utils.generateRandomNumber();
            int number2 = Utils.generateRandomNumber();
            String operation = String.valueOf(Utils.generateRandomNumber(0, 2));

            switch (operation) {
                case "1":
                    questions[i] = number1 + " + " + number2;
                    answers[i] = String.valueOf(number1 + number2);
                    break;
                case "2":
                    questions[i] = number1 + " - " + number2;
                    answers[i] = String.valueOf(number1 - number2);
                    break;
                default:
                    questions[i] = number1 + " * " + number2;
                    answers[i] = String.valueOf(number1 * number2);
                    break;
            }
        }
        Engine.playProgress(CALC_RULES, questions, answers);
    }
}

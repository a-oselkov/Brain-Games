package hexlet.code.games;

import static hexlet.code.Utils.generateRandomNumber;
import static hexlet.code.games.Constants.MAX_NUMBER;

public class Calc {
    public static String playCalc() {
        int number1 = generateRandomNumber(0, MAX_NUMBER);
        int number2 = generateRandomNumber(0, MAX_NUMBER);
        int operation = generateRandomNumber(0, 2);
        String rightAnswer;
        switch (operation) {
            case 1:
                System.out.println("Question: " + number1 + " + " + number2);
                rightAnswer = String.valueOf(number1 + number2);
                return rightAnswer;

            case 2:
                System.out.println("Question: " + number1 + " - " + number2);
                rightAnswer = String.valueOf(number1 - number2);
                return rightAnswer;

            default:
                System.out.println("Question: " + number1 + " * " + number2);
                rightAnswer = String.valueOf(number1 * number2);
                return rightAnswer;
        }
    }
}

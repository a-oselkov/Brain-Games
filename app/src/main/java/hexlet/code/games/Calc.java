package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.games.Constants.MAX_NUMBER;

public class Calc {
    public static String playCalc() {
        int number1 = Utils.generateRandomNumber(0, MAX_NUMBER);
        int number2 = Utils.generateRandomNumber(0, MAX_NUMBER);
        int operation = Utils.generateRandomNumber(0, 2);
        String correctAnswer;
        switch (operation) {
            case 1:
                System.out.println("Question: " + number1 + " + " + number2);
                correctAnswer = String.valueOf(number1 + number2);
                return correctAnswer;

            case 2:
                System.out.println("Question: " + number1 + " - " + number2);
                correctAnswer = String.valueOf(number1 - number2);
                return correctAnswer;

            default:
                System.out.println("Question: " + number1 + " * " + number2);
                correctAnswer = String.valueOf(number1 * number2);
                return correctAnswer;
        }
    }
}

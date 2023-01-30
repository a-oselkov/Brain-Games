package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.*;

public class Calc {
    private static void takeRandomOperation(int number1, int number2, int operation) {
        switch (operation) {
            case 1 -> {
                System.out.println("Question: " + number1 + " + " + number2);
                correctAnswer = number1 + number2;
            }
            case 2 -> {
                System.out.println("Question: " + number1 + " - " + number2);
                correctAnswer = number1 - number2;
            }
            default -> {
                System.out.println("Question: " + number1 + " * " + number2);
                correctAnswer = number1 * number2;
            }
        }
    }
    public static void playCalc() {
        Cli.greet();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            if (i != correctAnswersCount) {
                break;
            }
            int randomOperation = Utils.generateRandomNumber(1, 3);
            Calc.takeRandomOperation(randomNumber, randomNumber2, randomOperation);
            Engine.playProgress(correctAnswer);
        }
    }
}

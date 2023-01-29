package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.correctAnswer;

public class Calc {
    public static void getRandomOperator(int number1, int number2, int operator) {
        switch (operator) {
            case 1 -> {
                System.out.println("Question: " + number1 + "+" + number2);
                correctAnswer = number1 + number2;
            }
            case 2 -> {
                System.out.println("Question: " + number1 + "-" + number2);
                correctAnswer = number1 - number2;
            }
            default -> {
                System.out.println("Question: " + number1 + "*" + number2);
                correctAnswer = number1 * number2;
            }
        }
    }
    public static void playCalc() {
        Engine.greet();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            if (i != Engine.correctAnswersCount) {
                break;
            }
            Calc.getRandomOperator(Engine.generateRandomNumber(0, 100), Engine.generateRandomNumber(0, 100),Engine.generateRandomNumber(1, 3));
            Engine.playProgress(correctAnswer);
        }
    }
}

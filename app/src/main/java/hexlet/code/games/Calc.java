package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    static int result;
    public static void getRandomOperator() {
        int number1 = Engine.generateRandomNumber(0, 100);
        int number2 = Engine.generateRandomNumber(0, 100);
        int operator = Engine.generateRandomNumber(1, 3);
        switch (operator) {
            case 1 -> {
                System.out.println("Question: " + number1 + "+" + number2);
                result = number1 + number2;
            }
            case 2 -> {
                System.out.println("Question: " + number1 + "-" + number2);
                result = number1 - number2;
            }
            default -> {
                System.out.println("Question: " + number1 + "*" + number2);
                result = number1 * number2;
            }
        }
    }
    public static void calcPlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        Engine.greet();
        while (Engine.correctAnswersCount < 3) {
            Calc.getRandomOperator();
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer != result) {
                Engine.getWrongAnswerMessage(answer, result);
                break;
            }
            System.out.println("Correct!");
            Engine.correctAnswersCount++;
            if (Engine.correctAnswersCount == 3) {
                Engine.getCongratulationMessage();
            }
        }
    }
}

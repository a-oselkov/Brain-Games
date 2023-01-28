package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.correctAnswersCount;
import static hexlet.code.Engine.generateRandomNumber;
import static hexlet.code.Engine.getCongratulationMessage;
import static hexlet.code.Engine.getWrongAnswerMessage;
import static hexlet.code.Engine.greet;

public class Calc {
    static int result;
    public static void getRandomOperator() {
        int number1 = generateRandomNumber(0, 100);
        int number2 = generateRandomNumber(0, 100);
        int operator = generateRandomNumber(1, 3);
        greet();
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
        while (correctAnswersCount < 3) {
            Calc.getRandomOperator();
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer != result) {
                getWrongAnswerMessage(answer, result);
                break;
            }
            System.out.println("Correct!");
            correctAnswersCount++;
            if (correctAnswersCount == 3) {
                getCongratulationMessage();
            }
        }
    }
}

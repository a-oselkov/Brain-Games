package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    public static int result;
    public static void getGcd() {
        int number1 = Engine.generateRandomNumber(0, 100);
        int number2 = Engine.generateRandomNumber(0, 100);
        result = number1;
        while (result > 0) {
            if ((number1 % result == 0) && (number2 % result == 0)) {
                break;
            }
            result--;
        }
        System.out.println("Question: " + number1 + " " + number2);
    }
    public static void playGcd() {
        Scanner scanner = new Scanner(System.in);
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (Engine.correctAnswersCount > 0) {
            Gcd.getGcd();
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer != result) {
                Engine.getWrongAnswerMessage(answer, result);
                break;
            }
            System.out.println("Correct!");
            Engine.correctAnswersCount--;

            if (Engine.correctAnswersCount == 0) {
                Engine.getCongratulationMessage();
            }
        }
    }
}

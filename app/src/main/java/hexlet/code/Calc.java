package hexlet.code;

import java.util.Scanner;

public class Calc {
    static int result;
    public static int generateRandomNumber(int min, int max) {
        int randomNumber;
        max = max - min;
        randomNumber = (int) (Math.random() * (max + 1) + min);
        return randomNumber;
    }
    public static void getRandomOperator() {
        int number1 = generateRandomNumber(0, 100);
        int number2 = generateRandomNumber(0, 100);
        int operator = generateRandomNumber(1, 3);

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
        int correctAnswersCount = 0;
        Scanner scanner = new Scanner(System.in);
        String wrongAnswerMessage = "Let's try again, " + Cli.userName + "!";
        System.out.println("What is the result of the expression?");
        while (correctAnswersCount < 3) {
            Calc.getRandomOperator();
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            //System.out.println("");
            if (answer != result) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + result + "'" + ".");
                System.out.println(wrongAnswerMessage);
                break;
            }
            System.out.println("Correct!");
            correctAnswersCount++;
            if (correctAnswersCount == 3) {
                System.out.println("Congratulations, " + Cli.userName + "!");
            }
        }
    }
}

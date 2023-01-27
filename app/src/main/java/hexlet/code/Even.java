package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.userName;

public class Even {

    private static int generateRandomNumber() {
        int maxNumber = 100;
        int randomNumber;
        randomNumber = (int) (Math.random() * maxNumber);
        return randomNumber;
    }
    public static void evenPlay() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctAnswersCount = 0;
        Scanner sc = new Scanner(System.in);
        while (correctAnswersCount < 3) {
            int number = generateRandomNumber();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            //System.out.println("");
            if (number % 2 == 0 && answer.equals("yes") || number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                correctAnswersCount++;
            }
            if (number % 2 == 0 && answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, Bill!");
                break;
            }
            if (number % 2 != 0 && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, Bill!");
                break;
            }
        }
        System.out.println("Congratulations, " + userName);

    }
}

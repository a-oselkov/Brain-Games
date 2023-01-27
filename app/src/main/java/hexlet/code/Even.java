package hexlet.code;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        while (correctAnswersCount < 3) {
            int number = generateRandomNumber();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            //System.out.println("");
            if (number % 2 == 0 && !answer.equals("yes")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.userName + "!");
                break;
            } else if (number % 2 != 0 && !answer.equals("no")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Cli.userName + "!");
                break;
            } else {
                System.out.println("Correct!");
                correctAnswersCount++;
            }
        }
        if (correctAnswersCount == 3){
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
    }
}


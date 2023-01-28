package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.correctAnswersCount;
import static hexlet.code.Engine.generateRandomNumber;
import static hexlet.code.Engine.getCongratulationMessage;
import static hexlet.code.Engine.getWrongAnswerMessage;
import static hexlet.code.Engine.greet;

public class Even {
    public static void evenPlay() {
        Scanner scanner = new Scanner(System.in);
        greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (correctAnswersCount < 3) {
            int number = generateRandomNumber(0, 100);
            String correctAnswerYes = "yes";
            String correctAnswerNo = "no";
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (number % 2 == 0 && !answer.equals("yes")) {
                getWrongAnswerMessage(answer, correctAnswerYes);
                break;
            } else if (number % 2 != 0 && !answer.equals("no")) {
                getWrongAnswerMessage(answer, correctAnswerNo);
                break;
            }
            System.out.println("Correct!");
            correctAnswersCount++;
        }
        if (correctAnswersCount == 3) {
            getCongratulationMessage();
        }
    }
}


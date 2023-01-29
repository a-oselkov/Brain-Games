package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void evenPlay() {
        Scanner scanner = new Scanner(System.in);
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < Engine.correctAnswersCount; i++) {
            int number = Engine.generateRandomNumber(0, 100);
            String correctAnswerYes = "yes";
            String correctAnswerNo = "no";
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (number % 2 == 0 && !answer.equals("yes")) {
                Engine.getWrongAnswerMessage(answer, correctAnswerYes);
                break;
            } else if (number % 2 != 0 && !answer.equals("no")) {
                Engine.getWrongAnswerMessage(answer, correctAnswerNo);
                break;
            }
            System.out.println("Correct!");
            if (i == Engine.correctAnswersCount - 1) {
                Engine.getCongratulationMessage();
        }

        }
    }
}


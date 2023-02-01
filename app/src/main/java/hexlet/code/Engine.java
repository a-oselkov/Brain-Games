package hexlet.code;

import java.util.Scanner;

import static hexlet.code.games.Constants.MAX_ROUNDS;

public class Engine {
    public static String[] answerQuestion = new String[MAX_ROUNDS * 2];
    public static void playProgress(String rules) {
        int correctAnswersCount = 0;
        Cli.greet();

        System.out.println(rules);

        for (int i = 0; i < answerQuestion.length - 1; i = i + 2) {
            System.out.println(answerQuestion[i]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (!answer.equals(answerQuestion[i + 1])) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + answerQuestion[i + 1] + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
            correctAnswersCount++;
            System.out.println("Correct!");
            if (correctAnswersCount == MAX_ROUNDS) {
                System.out.println("Congratulations, " + Cli.getName() + "!");
            }
        }
    }
}


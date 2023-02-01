package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;
    public static void playProgress(String rules, String[] answerQuestion) {
        int correctAnswersCount = 0;
        Cli.greet();

        System.out.println(rules);

        for (int i = 0; i < answerQuestion.length; i = i + 2) {
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


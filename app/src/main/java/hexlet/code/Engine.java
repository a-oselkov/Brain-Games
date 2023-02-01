package hexlet.code;

import java.util.Scanner;

import static hexlet.code.games.Constants.MAX_ROUNDS;

public class Engine {

    public static String correctAnswer;
    public static void playProgress(String rules) {
        int correctAnswersCount = 0;
        Cli.greet();

        System.out.println(rules);

        for (int i = 0; i < MAX_ROUNDS; i++) {
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + correctAnswer + "'.");
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


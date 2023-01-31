package hexlet.code;

import hexlet.code.games.Cli;

import java.util.Scanner;

import static hexlet.code.games.Calc.playCalc;
import static hexlet.code.games.Even.playEven;
import static hexlet.code.games.Gcd.playGcd;
import static hexlet.code.games.Prime.playPrime;
import static hexlet.code.games.Progression.playProgression;

public class Engine {
    public static int correctAnswersCount = 0;
    public static String choice;

    public static void playProgress(String rules) {
        String rightAnswer = "";
        Cli.greet();
        System.out.println(rules);
        for (int i = 0; i < 3; i++) {
            if (i != correctAnswersCount) {
                break;
            }
            switch (choice) {
                case "2" -> rightAnswer = playEven();
                case "3" -> rightAnswer = playCalc();
                case "4" -> rightAnswer = playGcd();
                case "5" -> rightAnswer = playProgression();
                case "6" -> rightAnswer = playPrime();
                default -> { }
            }
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (!answer.equals(rightAnswer)) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + rightAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
            correctAnswersCount++;
            System.out.println("Correct!");
            if (correctAnswersCount == 3) {
                System.out.println("Congratulations, " + Cli.getName() + "!");
            }
        }
    }
}


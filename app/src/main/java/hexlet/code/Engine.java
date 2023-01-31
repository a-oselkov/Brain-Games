package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

import static hexlet.code.games.Constants.MAX_ROUNDS;
public class Engine {
    public static String choice;
    public static void playProgress(String rules) {
        int correctAnswersCount = 0;
        String correctAnswer = "";

        Cli.greet();
        System.out.println(rules);

        for (int i = 0; i < MAX_ROUNDS; i++) {
            switch (choice) {
                case "2":
                    correctAnswer = Even.playEven();
                    break;
                case "3":
                    correctAnswer = Calc.playCalc();
                    break;
                case "4":
                    correctAnswer = Gcd.playGcd();
                    break;
                case "5":
                    correctAnswer = Progression.playProgression();
                    break;
                case "6":
                    correctAnswer = Prime.playPrime();
                    break;
                default:
                    break;
            }
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


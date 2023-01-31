package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

import static hexlet.code.App.getChoice;
import static hexlet.code.games.Constants.MAX_ROUNDS;
public class Engine {
    public static String play() {
        String choice = getChoice();
        return switch (choice) {
            case "2" -> Even.playEven();
            case "3" -> Calc.playCalc();
            case "4" -> Gcd.playGcd();
            case "5" -> Progression.playProgression();
            case "6" -> Prime.playPrime();
            default -> "";
        };
    }
    public static void playProgress(String rules) {
        int correctAnswersCount = 0;
        Cli.greet();

        System.out.println(rules);
        String correctAnswer = play();

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


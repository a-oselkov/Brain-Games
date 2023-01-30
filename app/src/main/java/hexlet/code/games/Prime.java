package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.correctAnswersCount;

public class Prime {
    public static String getPrime(int number) {
        System.out.println("Question: " + number);
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public static void playPrime() {
        Cli.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            if (i != correctAnswersCount) {
                break;
            }
            String answer = getPrime(Utils.generateRandomNumber(0, 100));
            Engine.playProgress(answer);
        }
    }
}

package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.randomNumber;

public class Prime {
    private static String takeNumber(int number) {
        System.out.println("Question: " + number);
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public static void playPrime() {
        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            if (i != Engine.correctAnswersCount) {
                break;
            }
            String answer = takeNumber(randomNumber);
            Engine.playProgress(answer);
        }
    }
}

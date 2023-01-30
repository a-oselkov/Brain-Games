package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.correctAnswer;
import static hexlet.code.Engine.correctAnswersCount;
import static hexlet.code.Engine.randomNumber;
import static hexlet.code.Engine.randomNumber2;

public class Gcd {
    private static void takeGcd(int number1, int number2) {
        System.out.println("Question: " + number1 + " " + number2);
        while (number2 > 0) {
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        correctAnswer = number1;
    }
    public static void playGcd() {
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            if (i != correctAnswersCount) {
                break;
            }
            Gcd.takeGcd(randomNumber, randomNumber2 + 1);
            Engine.playProgress(correctAnswer);
        }
    }
}

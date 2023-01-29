package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.correctAnswer;
import static hexlet.code.Engine.correctAnswersCount;

public class Gcd {
    public static int getGcd(int number1, int number2) {
        if (number1 == 0) {
            return number2;
        }
        correctAnswer = number1;
        while (correctAnswer >= 0) {
            if ((number1 % correctAnswer == 0) && (number2 % correctAnswer == 0)) {
                break;
            }
            correctAnswer--;
        }
        System.out.println("Question: " + number1 + " " + number2);
        return correctAnswer;
    }
    public static void playGcd() {
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            if (i != correctAnswersCount) {
                break;
            }
            Gcd.getGcd(Engine.generateRandomNumber(0, 100), Engine.generateRandomNumber(0, 100));
            Engine.playProgress(correctAnswer);
        }
    }
}

package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.correctAnswer;

public class Gcd {
    public static void getGcd(int number1, int number2) {
        correctAnswer = number1;
        while (correctAnswer >= 0) {
            if (number1 == 0) {
                correctAnswer = number2;
                break;
            }
            if ((number1 % correctAnswer == 0) && (number2 % correctAnswer == 0)) {
                break;
            }
            correctAnswer--;
        }
        System.out.println("Question: " + number1 + " " + number2);
    }
    public static void playGcd() {
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            if (i != Engine.correctAnswersCount) {
                break;
            }
            Gcd.getGcd(Engine.generateRandomNumber(0, 100), Engine.generateRandomNumber(0, 100));
            Engine.playProgress(correctAnswer);
        }
    }
}

package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.games.Constants.MAX_NUMBER;
import static hexlet.code.Engine.correctAnswer;
public class Gcd {
    public static String playGcd() {
        int number1 = Utils.generateRandomNumber(0, MAX_NUMBER);
        int number2 = Utils.generateRandomNumber(1, MAX_NUMBER);
        System.out.println("Question: " + number1 + " " + number2);
        while (number2 > 0) {
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        correctAnswer = String.valueOf(number1);
        return correctAnswer;
    }
}

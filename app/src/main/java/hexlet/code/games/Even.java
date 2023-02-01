package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.games.Constants.MAX_NUMBER;
import static hexlet.code.Engine.correctAnswer;
public class Even {
    public static String playEven() {
        int number = Utils.generateRandomNumber(0, MAX_NUMBER);
        System.out.println("Question: " + number);
        if (number % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return correctAnswer;
    }
}

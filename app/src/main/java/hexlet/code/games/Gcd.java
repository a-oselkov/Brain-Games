package hexlet.code.games;

import static hexlet.code.Utils.generateRandomNumber;
import static hexlet.code.games.Constants.MAX_NUMBER;

public class Gcd {
    public static String playGcd() {
        int number1 = generateRandomNumber(0, MAX_NUMBER);
        int number2 = generateRandomNumber(1, MAX_NUMBER);
        String rightAnswer;
        System.out.println("Question: " + number1 + " " + number2);
        while (number2 > 0) {
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        rightAnswer = String.valueOf(number1);
        return rightAnswer;
    }
}

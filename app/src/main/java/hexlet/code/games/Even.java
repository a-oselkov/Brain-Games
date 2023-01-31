package hexlet.code.games;

import static hexlet.code.Utils.generateRandomNumber;
import static hexlet.code.games.Constants.MAX_NUMBER;

public class Even {
    public static String playEven() {
        int number = generateRandomNumber(0, MAX_NUMBER);
        String rightAnswer;
        System.out.println("Question " + number);
        if (number % 2 == 0) {
            rightAnswer = "yes";
        } else {
            rightAnswer = "no";
        }
        return rightAnswer;
    }
}

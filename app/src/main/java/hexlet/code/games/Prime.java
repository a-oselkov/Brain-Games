package hexlet.code.games;

import static hexlet.code.Utils.generateRandomNumber;

public class Prime {
    public static String playPrime() {
        int number = generateRandomNumber(0, 100);
        String rightAnswer;
        System.out.println("Question " + number);
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                rightAnswer = "no";
                return rightAnswer;
            }
        }
        rightAnswer = "yes";
        return rightAnswer;


    }
}

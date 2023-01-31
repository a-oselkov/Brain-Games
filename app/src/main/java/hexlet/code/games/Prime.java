package hexlet.code.games;

import hexlet.code.Utils;

public class Prime {
    public static String playPrime() {
        int number = Utils.generateRandomNumber(0, 100);
        String correctAnswer;
        System.out.println("Question: " + number);
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                correctAnswer = "no";
                return correctAnswer;
            }
        }
        correctAnswer = "yes";
        return correctAnswer;


    }
}

package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static String getEven(int number) {
        System.out.println("Question: " + number);
        if (number % 2 == 0) {
            return "yes";
        }
            return "no";
    }
    public static void playEven() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            if (i != Engine.correctAnswersCount) {
                break;
            }
            String answer = getEven(Engine.generateRandomNumber(0, 100));
            Engine.playProgress(answer);
        }
    }
}
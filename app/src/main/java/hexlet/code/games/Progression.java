package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.correctAnswer;
import static hexlet.code.Engine.correctAnswersCount;
import static hexlet.code.Engine.randomNumber;

public class Progression {
    private static int takeProgression(int fistNumber, int step, int missingNumberPlace) {
        System.out.print("Question: ");
        for (int i = 0; i < missingNumberPlace; i++) {
            System.out.print(fistNumber + " ");
            fistNumber += step;
        }
        System.out.print(".. ");
        correctAnswer = fistNumber;
        fistNumber += step;
        for (int i = missingNumberPlace; i < 9; i++) {
            System.out.print(fistNumber + " ");
            fistNumber += step;
        }
        System.out.println(" ");
        return correctAnswer;
    }
    public static void playProgression() {
        Engine.greet();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            if (i != Engine.correctAnswersCount) {
                break;
            }
            int step = Engine.generateRandomNumber(1, 10);
            int missingNumberPlace = Engine.generateRandomNumber(0, 9);
            int answer = takeProgression(randomNumber, step, missingNumberPlace);
            Engine.playProgress(answer);
        }
    }
}

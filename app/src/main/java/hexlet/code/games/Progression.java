package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.correctAnswer;

public class Progression {
    public static int getProgression(int fistNumber, int step, int missingNumberPlace) {
        System.out.print("Question: ");
        for (int i = 0; i < missingNumberPlace; i++) {
            System.out.print(fistNumber + " ");
            fistNumber += step;
        }
        System.out.print(".. ");
        correctAnswer = fistNumber;
        fistNumber += step;
        for (int i = missingNumberPlace; i < 10; i++) {
            System.out.print(fistNumber + " ");
            fistNumber += step;
        }
        System.out.println("");
        return correctAnswer;
    }
    public static void playProgression() {
        Engine.greet();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            if (i != Engine.correctAnswersCount) {
                break;
            }
            int answer = getProgression(Engine.generateRandomNumber(0, 20), Engine.generateRandomNumber(1, 10), Engine.generateRandomNumber(0, 10));
            Engine.playProgress(answer);
        }
    }
}

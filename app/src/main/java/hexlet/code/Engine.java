package hexlet.code;

import hexlet.code.games.Cli;

import java.util.Scanner;

public class Engine {
    public static int correctAnswersCount = 0;                       //Счетчик верных ответов.
    public static int correctAnswer;                                 //Верный ответ

    public static int randomNumber = Utils.generateRandomNumber(0, 100);  // Случайное число в заданном диапазоне
    public static int randomNumber2 = Utils.generateRandomNumber(0, 100);  // Случайное число в заданном диапазоне

    public static void getWrongAnswerMessage(String answer, String corAnswer) { //Сообщение при неправильном ответе.
        System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + corAnswer + "'.");
        System.out.println("Let's try again, " + Cli.getName() + "!");
    }
    public static void getWrongAnswerMessage(int answer, int corAnswer) {       //Сообщение при неправильном ответе.
        System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + corAnswer + "'.");
        System.out.println("Let's try again, " + Cli.getName() + "!");
    }
    public static void playProgress(int result) {                  // Ход игры для результата - число
        System.out.print("Your answer: ");
        randomNumber = Utils.generateRandomNumber(0, 100);
        randomNumber2 = Utils.generateRandomNumber(0, 100);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer != result) {
            getWrongAnswerMessage(answer, result);
            return;
        }
        correctAnswersCount++;
        System.out.println("Correct!");
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
    public static void playProgress(String result) {                // Ход игры для результата - строка
        System.out.print("Your answer: ");
        randomNumber = Utils.generateRandomNumber(0, 100);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (!answer.equals(result)) {
            getWrongAnswerMessage(answer, result);
            return;
        }
        correctAnswersCount++;
        System.out.println("Correct!");
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}


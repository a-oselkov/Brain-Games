package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userName;                                   //Имя пользователя.
    public static int correctAnswersCount = 0;                       //Счетчик верных ответов.
    public static int correctAnswer;                                 //Верный ответ

    public static int randomNumber = generateRandomNumber(0, 100);  // Случайное число в заданном диапазоне
    public static int randomNumber2 = generateRandomNumber(0, 100);  // Случайное число в заданном диапазоне
    public static void greet() {                                     //Приветствие.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(" ");
    }
    public static int generateRandomNumber(int min, int max) {   //Генератор случайного числа в диапозоне [min ; max]
        max = max - min;
        return (int) (Math.random() * (max + 1) + min);
    }
    public static void getWrongAnswerMessage(String answer, String correctAnswer) { //Сообщение при неправильном ответе.
        System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + correctAnswer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }
    public static void getWrongAnswerMessage(int answer, int correctAnswer) {       //Сообщение при неправильном ответе.
        System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + correctAnswer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }
    public static void playProgress(int result) {                  // Ход игры для результата - число
        System.out.print("Your answer: ");
        randomNumber = generateRandomNumber(0, 100);
        randomNumber2 = generateRandomNumber(0, 100);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer != result) {
            getWrongAnswerMessage(answer, result);
            return;
        }
        Engine.correctAnswersCount++;
        System.out.println("Correct!");
        if (Engine.correctAnswersCount == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    public static void playProgress(String result) {                // Ход игры для результата - строка
        System.out.print("Your answer: ");
        randomNumber = generateRandomNumber(0, 100);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (!answer.equals(result)) {
            getWrongAnswerMessage(answer, result);
            return;
        }
        correctAnswersCount++;
        System.out.println("Correct!");
        if (correctAnswersCount == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}


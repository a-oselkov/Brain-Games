package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String userName;                              //Имя пользователя.
    public static int correctAnswersCount = 0;                  //Счетчик верных ответов.
    public static int correctAnswer;                            //Верный ответ
    public static void greet() {                                //Приветствие.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("");
    }
    public static int generateRandomNumber(int min, int max) {   //Генератор случайного числа в диапозоне [min ; max]
        int randomNumber;
        max = max - min;
        randomNumber = (int) (Math.random() * (max + 1) + min);
        return randomNumber;
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();
        if (answer != result) {
            Engine.getWrongAnswerMessage(answer, result);
            return;
        }
        Engine.correctAnswersCount++;
        System.out.println("Correct!");
        if (Engine.correctAnswersCount == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    public static void playProgress(String result) {                // Ход игры для результата - строка
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();
        if (!answer.equals(result)) {
            Engine.getWrongAnswerMessage(answer, result);
            return;
        }
        Engine.correctAnswersCount++;
        System.out.println("Correct!");
        if (Engine.correctAnswersCount == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}


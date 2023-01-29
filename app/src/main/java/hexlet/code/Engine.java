package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String userName;                              //Имя пользователя.
    public static int correctAnswersCount = 0;                  //Счетчик верных ответов.

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
    public static void getCongratulationMessage() {                  //Сообщение после 3х верных ответов.
        System.out.println("Congratulations, " + userName + "!");
    }
}

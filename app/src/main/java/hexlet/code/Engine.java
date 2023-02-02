package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;
    public static void playGame(String rules, String[][] questionsAnswersGame) {
        String playerName = Greeting.greet();

        System.out.println(rules);

        for (int i = 0; i < MAX_ROUNDS; i++) {
            System.out.print("Question: ");
            System.out.println(questionsAnswersGame[i][0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (!answer.equals(questionsAnswersGame[i][1])) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + questionsAnswersGame[i][1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}


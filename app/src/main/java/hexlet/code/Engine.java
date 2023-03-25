package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;

    public static void playGame(String rules, String[][] questionsAnswersGame) {
        String playerName = Greeting.greet();

        System.out.println(rules);

        for (String[] round : questionsAnswersGame) {
            System.out.print(String.format("""
                    Question: %s
                    Your answer:\s""", round[0]));
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (!answer.equals(round[1])) {
                System.out.println(String.format("""
                        '%s' is wrong answer ;(. Correct answer was '%s'.
                        Let's try again, %s!""", answer, round[1], playerName));
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println(String.format("Congratulations, %s!", playerName));
    }
}



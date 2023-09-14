package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;
    public static final RoundInfo[] ROUND_INFO = new RoundInfo[MAX_ROUNDS];
    public static String RULE;
    public static void playGame() {
        String playerName = Greeting.greet();

        System.out.println(RULE);

        for (RoundInfo round : ROUND_INFO) {
            System.out.print(String.format("""
                    Question: %s
                    Your answer:\s""", round.getQuestion()));
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (!answer.equals(round.getAnswer())) {
                System.out.println(String.format("""
                        '%s' is wrong answer ;(. Correct answer was '%s'.
                        Let's try again, %s!""", answer, round.getAnswer(), playerName));
                return;
            }
            System.out.println("Correct!\n");
        }
        System.out.println(String.format("Congratulations, %s!", playerName));
    }
}



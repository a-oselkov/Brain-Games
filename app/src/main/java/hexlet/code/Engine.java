package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int MAX_ROUNDS = 3;
    public static final RoundData[] ROUND_DATA = new RoundData[MAX_ROUNDS];
    private static boolean isExitSelected = false;

    private static void makeMenu() {
        System.out.println(String.format("Select menu item 0-%s", Games.values().length));
        for (int i = 0; i < Games.values().length; i++) {
            System.out.println(String.format("%s - %s", i, Games.values()[i]));
        }
        System.out.println(String.format("%s - EXIT", Games.values().length));
    }

    private static int selectMenuItem() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        try {
            choice = scanner.nextInt();
            if (choice == Games.values().length) {
                System.out.println("Goodbye.");
                isExitSelected = true;
                System.exit(0);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect selection, please try again.");
            selectMenuItem();
        }
        System.out.println(String.format("You choice: %s - %s", choice, Games.values()[choice]));
        return choice;
    }

    private static void makeGameData(int gameNumber) {
        Gaming game = Games.values()[gameNumber].getGame();
        for (int i = 0; i < MAX_ROUNDS; i++) {
            ROUND_DATA[i] = game.makeGame();
        }
    }

    private static boolean playRound(RoundData roundData, String playerName) {
        System.out.print(String.format("""
                Question: %s
                Your answer:\s""", roundData.getQuestion()));
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (!answer.equals(roundData.getAnswer())) {
            System.out.println(String.format("""
                    \n'%s' is wrong answer ;(. Correct answer was '%s'.
                    Let's try again, %s!\n""", answer, roundData.getAnswer(), playerName));
            return false;
        }
        System.out.println("Correct!\n");
        return true;
    }

    public static void playGame() {
        boolean isAnswerCorrect = true;
        String playerName = Greeting.greet();

        while (!isExitSelected) {
            makeMenu();
            int gameNumber = selectMenuItem();
            makeGameData(gameNumber);
            System.out.println(Games.values()[gameNumber].getRule());
            for (RoundData round : ROUND_DATA) {
                if (!playRound(round, playerName)) {
                    isAnswerCorrect = false;
                    break;
                }
            }
            if (isAnswerCorrect) {
                System.out.println(String.format("Congratulations, %s, you won!\n", playerName));
            }
        }
    }
}



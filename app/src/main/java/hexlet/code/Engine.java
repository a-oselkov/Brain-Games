package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int MAX_ROUNDS = 3;
    public static final RoundData[] ROUND_DATA = new RoundData[MAX_ROUNDS];
    private static boolean isExitSelected = false;
    private static boolean isAnswerCorrect;

    private static void createMenu() {
        System.out.println(String.format("Select menu item 0-%s", Game.values().length));
        for (int i = 0; i < Game.values().length; i++) {
            System.out.println(String.format("%s - %s", i, Game.values()[i]));
        }
        System.out.println(String.format("%s - EXIT", Game.values().length));
    }

    private static Game selectMenuItem() {
        int lastMenuItem = Game.values().length;
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == lastMenuItem) {
            System.out.println("Goodbye.");
            isExitSelected = true;
            System.exit(0);
        }
        if (choice < 0 || choice > lastMenuItem) {
            System.out.println("Incorrect selection, please try again.");
            selectMenuItem();
        }
        Game game = Game.values()[choice];
        System.out.println(String.format("You choice: %s - %s", choice, game));
        return game;
    }

    private static void createGameData(Game game) {
        for (int i = 0; i < MAX_ROUNDS; i++) {
            ROUND_DATA[i] = game.getGame().createRoundData();
        }
    }

    private static void playRound(RoundData roundData, String playerName) {
        System.out.print(String.format("""
                Question: %s
                Your answer:\s""", roundData.getQuestion()));
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (!answer.equals(roundData.getAnswer())) {
            System.out.println(String.format("""
                    \n'%s' is wrong answer ;(. Correct answer was '%s'.
                    Let's try again, %s!\n""", answer, roundData.getAnswer(), playerName));
            isAnswerCorrect = false;
            return;
        }
        System.out.println("Correct!\n");
    }

    public static void playGame() {
        String playerName = Greeting.greet();

        while (!isExitSelected) {
            createMenu();
            Game game = selectMenuItem();
            createGameData(game);
            System.out.println(game.getRule());
            isAnswerCorrect = true;
            for (RoundData round : ROUND_DATA) {
                playRound(round, playerName);
                if (!isAnswerCorrect) {
                    break;
                }
            }
            if (isAnswerCorrect) {
                System.out.println(String.format("Congratulations, %s, you won!\n", playerName));
            }
        }
    }
}



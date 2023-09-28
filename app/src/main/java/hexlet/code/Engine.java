package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private static final int MAX_ROUNDS = 3;
    private static final RoundData[] ROUND_DATA = new RoundData[MAX_ROUNDS];
    private String playerName;
    private int selectedGameNumber;
    private boolean isExitSelected = false;

    public void greet() {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!\n");
    }

    public void createMenu() {
        int menuItemAmount = Game.values().length;
        System.out.printf("Select menu item 0-%s\n", menuItemAmount);
        for (int i = 0; i < Game.values().length; i++) {
            System.out.printf("%s - %s\n", i, Game.values()[i]);
        }
        System.out.printf("%s - EXIT\n", menuItemAmount);
    }

    public void selectGameNumber() {
        int exitMenuItem = Game.values().length;
        Scanner scanner = new Scanner(System.in);
        selectedGameNumber = scanner.nextInt();
        if (selectedGameNumber == exitMenuItem) {
            System.out.println("Goodbye.");
            isExitSelected = true;
            System.exit(0);
        }
        if (selectedGameNumber < 0 || selectedGameNumber > exitMenuItem) {
            System.out.println("Incorrect selection, please try again.");
            selectGameNumber();
        }
        System.out.printf("You choice: %s - %s\n",
                selectedGameNumber, Game.values()[selectedGameNumber]);
    }

    public void generateGameData() {
        Gameable game = Game.values()[selectedGameNumber].getGame();
        System.out.println(game.getDescription());
        for (int i = 0; i < MAX_ROUNDS; i++) {
            ROUND_DATA[i] = game.getRoundData();
        }
    }

    public boolean playRound(RoundData roundData) {
        System.out.printf("""
                Question: %s
                Your answer:\s""", roundData.getQuestion());
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (!answer.equals(roundData.getAnswer())) {
            System.out.printf("""
                    \n'%s' is wrong answer ;(. Correct answer was '%s'.
                    Let's try again, %s!""", answer, roundData.getAnswer(), playerName);
            returnToMenu();
            return false;
        }
        System.out.println("Correct!\n");
        return true;
    }

    public void playGame() {
        for (RoundData round : ROUND_DATA) {
            if (!playRound(round)) {
                return;
            }
        }
        System.out.printf("Congratulations, %s, you won!", playerName);
        returnToMenu();
    }

    public boolean isExitSelected() {
        return isExitSelected;
    }

    private void returnToMenu() {
        System.out.println("\n\nPress 'Enter' to return to the menu");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}



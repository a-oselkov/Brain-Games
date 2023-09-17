package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private final int maxRounds = 3;
    private final RoundData[] roundData = new RoundData[maxRounds];
    private String playerName;
    private int selectedGameNumber;
    private boolean isExitSelected = false;
    private boolean isAnswerCorrect;

    public void greet() {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!\n");
    }

    public void createMenu() {
        int menuItemAmount = Game.values().length;
        System.out.println(String.format("Select menu item 0-%s", menuItemAmount));
        for (int i = 0; i < Game.values().length; i++) {
            System.out.println(String.format("%s - %s", i, Game.values()[i]));
        }
        System.out.println(String.format("%s - EXIT", menuItemAmount));
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
        System.out.println(String.format("You choice: %s - %s",
                selectedGameNumber, Game.values()[selectedGameNumber]));
    }

    public void generateGameData() {
        Gameable game = Game.values()[selectedGameNumber].getGame();
        System.out.println(game.getDescription());
        for (int i = 0; i < maxRounds; i++) {
            roundData[i] = game.getRoundData();
        }
    }

    public void playRound(RoundData roundData, String playerName) {
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
            System.out.println("Press 'Enter' to return to the menu");
            scanner.nextLine();
            return;
        }
        System.out.println("Correct!\n");
    }

    public void playGame() {
        isAnswerCorrect = true;
        for (RoundData round : roundData) {
            playRound(round, playerName);
            if (!isAnswerCorrect) {
                break;
            }
        }
        if (isAnswerCorrect) {
            System.out.println(String.format("Congratulations, %s, you won!\n", playerName));
            System.out.println("Press 'Enter' to return to the menu");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
    }

    public boolean isExitSelected() {
        return isExitSelected;
    }
}



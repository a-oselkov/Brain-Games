package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;
    private static final RoundInfo[] ROUND_INFO = new RoundInfo[MAX_ROUNDS];
    private static String rule;
    private static boolean isExitSelected = false;

    private static void makeMenu() {
        System.out.println(String.format("Select menu item 0-%s", Games.values().length));
        for (int i = 0; i < Games.values().length; i++) {
            System.out.println(String.format("%s - %s", i, Games.values()[i]));
        }
        System.out.println(String.format("%s - EXIT", Games.values().length));
    }

    private static void selectMenuItem() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == Games.values().length) {
            System.out.println("Goodbye.");
            isExitSelected = true;
            return;
        }
        Gaming game;
        try {
            game = Games.values()[choice].getGame();
            game.makeGame();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect selection, please try again.");
            selectMenuItem();
        }
    }

    public static void playGame() {
        makeMenu();
        selectMenuItem();
        if (!isExitSelected) {
            String playerName = Greeting.greet();
            System.out.println(rule);
            for (RoundInfo round : ROUND_INFO) {
                System.out.print(String.format("""
                        Question: %s
                        Your answer:\s""", round.getQuestion()));
                Scanner scanner = new Scanner(System.in);
                String answer = scanner.nextLine();
                if (!answer.equals(round.getAnswer())) {
                    System.out.println(String.format("""
                            \n'%s' is wrong answer ;(. Correct answer was '%s'.
                            Let's try again, %s!""", answer, round.getAnswer(), playerName));
                }
                System.out.println("Correct!\n");
            }
            System.out.println(String.format("Congratulations, %s, you won!\n", playerName));
        }
    }

    public static void setRoundInfo(int index, RoundInfo roundInfo) {
        ROUND_INFO[index] = roundInfo;
    }
    public static boolean isExitSelected() {
        return isExitSelected;
    }
    public static void setRule(String rule) {
        Engine.rule = rule;
    }
}



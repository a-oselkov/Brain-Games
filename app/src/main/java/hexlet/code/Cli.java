package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String playerName;

    public static String getName() {
        return playerName;
    }

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(" ");
    }
}

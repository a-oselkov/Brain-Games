package hexlet.code;

import java.util.Scanner;

public class Greeting {
    public static String greet() {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!\n");
        return playerName;
    }
}

package hexlet.code;

import java.util.Scanner;

public class Greeting {
    public static String greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(" ");
        return playerName;
    }
}

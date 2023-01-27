package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String userName;

    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("");
    }
}

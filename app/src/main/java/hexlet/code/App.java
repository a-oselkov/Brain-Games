package hexlet.code;

import hexlet.code.games.Cli;

import java.util.Scanner;

import static hexlet.code.Engine.playProgress;
import static hexlet.code.games.Constants.CALC_RULES;
import static hexlet.code.games.Constants.EVEN_RULES;
import static hexlet.code.games.Constants.GCD_RULES;
import static hexlet.code.games.Constants.PRIME_RULES;
import static hexlet.code.games.Constants.PROGRESSION_RULES;

public class App {
    private static String choice;
    public static String getChoice() {
        return choice;
    }
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        choice = scanner.nextLine();

        switch (choice) {
            case "1" -> Cli.greet();
            case "2" -> playProgress(EVEN_RULES);
            case "3" -> playProgress(CALC_RULES);
            case "4" -> playProgress(GCD_RULES);
            case "5" -> playProgress(PROGRESSION_RULES);
            case "6" -> playProgress(PRIME_RULES);
            case "0" -> { }
            default -> System.out.println("Restart the game and select 0-6");
        }
        scanner.close();
    }
}

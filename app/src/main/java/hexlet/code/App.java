package hexlet.code;

import java.util.Scanner;

import static hexlet.code.games.Calc.playCalc;
import static hexlet.code.games.Even.playEven;
import static hexlet.code.games.Gcd.playGcd;
import static hexlet.code.games.Prime.playPrime;
import static hexlet.code.games.Progression.playProgression;

public class App {
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
        String choice = scanner.nextLine();

        switch (choice) {
            case "1" -> Cli.greet();
            case "2" -> playEven();
            case "3" -> playCalc();
            case "4" -> playGcd();
            case "5" -> playProgression();
            case "6" -> playPrime();
            case "0" -> { }
            default -> System.out.println("Restart the game and select 0-6");
        }
        scanner.close();
    }
}

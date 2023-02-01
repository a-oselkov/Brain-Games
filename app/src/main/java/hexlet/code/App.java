package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

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
            case "1" -> Greeting.greet();
            case "2" -> Even.playEven();
            case "3" -> Calc.playCalc();
            case "4" -> Gcd.playGcd();
            case "5" -> Progression.playProgression();
            case "6" -> Prime.playPrime();
            case "0" -> System.out.println("Goodbye");
            default -> System.out.println("Restart the game and select 0-6");
        }
        scanner.close();
    }
}

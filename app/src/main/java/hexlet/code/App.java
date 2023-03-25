package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.print(String.format("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s"""));

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


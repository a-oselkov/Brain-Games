package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        for (int i = 0; i < Games.values().length; i++) {
            System.out.println(i + " - " + Games.values()[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        Gaming game = Games.values()[choice].getGame();
        game.generateGame();
        Engine.playGame();
        scanner.close();
    }
}


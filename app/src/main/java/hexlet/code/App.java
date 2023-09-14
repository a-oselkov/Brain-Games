package hexlet.code;

import java.util.Scanner;

public class App {
    public static void makeMenu() {
        System.out.println(String.format("Select menu item 0-%s", Games.values().length));
        for (int i = 0; i < Games.values().length; i++) {
            System.out.println(String.format("%s - %s", i, Games.values()[i]));
        }
        System.out.println(String.format("%s - EXIT", Games.values().length));
    }
    public static void selectMenuItem() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == Games.values().length) {
            System.out.println("Goodbye.");
            return;
        }
        Gaming game;
        try {
            game = Games.values()[choice].getGame();
            game.makeGame();
            Engine.playGame();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect selection, please try again.");
            selectMenuItem();
        } finally {
            scanner.close();
        }
    }
    public static void main(String[] args) {
        makeMenu();
        selectMenuItem();
    }
}


package hexlet.code;

public class App {
    public static void main(String[] args) {
        while (!Engine.isExitSelected()) {
            Engine.playGame();
        }
    }
}


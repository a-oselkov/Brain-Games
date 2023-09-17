package hexlet.code;

public class App {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.greet();
        while (!engine.isExitSelected()) {
            engine.createMenu();
            engine.selectGameNumber();
            engine.generateGameData();
            engine.playGame();
        }
    }
}


package hexlet.code.games;

import hexlet.code.Gameable;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Calc implements Gameable {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private String operation;
    private int number1;
    private int number2;

    @Override
    public RoundData getRoundData() {
        return new RoundData(generateQuestion(), generateAnswer());
    }

    @Override
    public String generateQuestion() {
        number1 = Utils.generateRandomNumber();
        number2 = Utils.generateRandomNumber();
        operation = String.valueOf(Utils.generateRandomNumber(0, 2));

        return switch (operation) {
            case "1" -> number1 + " + " + number2;
            case "2" -> number1 + " - " + number2;
            default -> number1 + " * " + number2;
        };
    }

    @Override
    public String generateAnswer() {
        return switch (operation) {
            case "1" -> String.valueOf(number1 + number2);
            case "2" -> String.valueOf(number1 - number2);
            default -> String.valueOf(number1 * number2);
        };
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}


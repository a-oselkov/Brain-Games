package hexlet.code.games;

import hexlet.code.Gameable;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Calc implements Gameable {
    private final String rule = "What is the result of the expression?";
    @Override
    public RoundData createRoundData() {
        int number1 = Utils.generateRandomNumber();
        int number2 = Utils.generateRandomNumber();
        String operation = String.valueOf(Utils.generateRandomNumber(0, 2));
        String question;
        String answer = switch (operation) {
            case "1" -> {
                question = number1 + " + " + number2;
                yield String.valueOf(number1 + number2);
            }
            case "2" -> {
                question = number1 + " - " + number2;
                yield String.valueOf(number1 - number2);
            }
            default -> {
                question = number1 + " * " + number2;
                yield String.valueOf(number1 * number2);
            }
        };
        return new RoundData(question, answer);
    }

    public String getRule() {
        return rule;
    }
}


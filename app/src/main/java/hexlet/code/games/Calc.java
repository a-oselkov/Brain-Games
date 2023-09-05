package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Gaming;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.ROUND_INFO;

public class Calc implements Gaming {
    @Override
    public void generateGame() {
        Engine.rule = "What is the result of the expression?";
        String answer;
        String question;
        String operation;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            int number1 = Utils.generateRandomNumber();
            int number2 = Utils.generateRandomNumber();
            operation = String.valueOf(Utils.generateRandomNumber(0, 2));

            answer = switch (operation) {
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
            ROUND_INFO[i] = new RoundInfo(question, answer);
        }
    }
}


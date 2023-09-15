package hexlet.code.games;

import hexlet.code.Gameable;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Gcd implements Gameable {
    private final String rule = "Find the greatest common divisor of given numbers.";
    @Override
    public RoundData createRoundData() {
        int number1 = Utils.generateRandomNumber();
        int number2 = Utils.generateRandomNumber();
        int gcd = getGcd(number1, number2);
        String question = number1 + " " + number2;
        String answer = String.valueOf(gcd);
        return new RoundData(question, answer);
    }
    private int getGcd(int number1, int number2) {
        while (number2 > 0) {
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        return number1;
    }

    public String getRule() {
        return rule;
    }
}

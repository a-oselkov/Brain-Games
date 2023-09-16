package hexlet.code.games;

import hexlet.code.Gameable;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Gcd implements Gameable {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

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
        return number1 + " " + number2;
    }

    @Override
    public String generateAnswer() {
        while (number2 > 0) {
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        return String.valueOf(number1);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

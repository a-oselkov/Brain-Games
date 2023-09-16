package hexlet.code.games;

import hexlet.code.Gameable;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Even implements Gameable {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private int number;

    @Override
    public RoundData getRoundData() {
        return new RoundData(generateQuestion(), generateAnswer());
    }
    @Override
    public String generateQuestion() {
        number = Utils.generateRandomNumber();
        return String.valueOf(number);
    }
    @Override
    public String generateAnswer() {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}


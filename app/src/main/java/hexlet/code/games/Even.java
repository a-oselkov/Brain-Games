package hexlet.code.games;

import hexlet.code.Gameable;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public final class Even implements Gameable {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final String YES = "yes";
    private static final String NO = "no";
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
        if (isEven(number)) {
            return YES;
        }
        return NO;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}


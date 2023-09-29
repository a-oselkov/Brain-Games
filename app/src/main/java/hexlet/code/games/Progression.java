package hexlet.code.games;

import hexlet.code.Gameable;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Progression implements Gameable {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MAX_MISSING_NUMBER_PLEASE = 9;
    private static final int MAX_STEP_PROGRESSION = 10;
    private int missingNumber;

    @Override
    public RoundData getRoundData() {
        return new RoundData(generateQuestion(), generateAnswer());
    }

    @Override
    public String generateQuestion() {
        return generateProgression();
    }

    @Override
    public String generateAnswer() {
        return String.valueOf(missingNumber);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    private String generateProgression() {
        StringBuilder progression = new StringBuilder();
        int numberOnPosition = Utils.generateRandomNumber();
        int step = Utils.generateRandomNumber(1, MAX_STEP_PROGRESSION);
        int missingNumberPosition = Utils.generateRandomNumber(0, MAX_MISSING_NUMBER_PLEASE);

        for (int i = 0; i < missingNumberPosition; i++) {
            progression.append(numberOnPosition).append(" ");
            numberOnPosition += step;
        }

        progression.append(".. ");
        missingNumber = numberOnPosition;
        numberOnPosition += step;

        for (int i = missingNumberPosition; i < MAX_MISSING_NUMBER_PLEASE; i++) {
            progression.append(numberOnPosition).append(" ");
            numberOnPosition += step;
        }
        return String.valueOf(progression);
    }
}

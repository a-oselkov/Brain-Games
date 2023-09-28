package hexlet.code.games;

import hexlet.code.Gameable;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Progression implements Gameable {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MAX_MISSING_NUMBER_PLEASE = 9;
    private static final int MAX_STEP_PROGRESSION = 10;
    private String missingNumber;

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
        return missingNumber;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    private String generateProgression() {
        StringBuilder progression = new StringBuilder();
        int nextNumber = Utils.generateRandomNumber();
        int step = Utils.generateRandomNumber(1, MAX_STEP_PROGRESSION);
        int missingNumberPosition = Utils.generateRandomNumber(0, MAX_MISSING_NUMBER_PLEASE);

        for (int i = 0; i < missingNumberPosition; i++) {
            progression.append(nextNumber).append(" ");
            nextNumber += step;
        }

        progression.append(".. ");
        missingNumber = String.valueOf(nextNumber);
        nextNumber += step;

        for (int i = missingNumberPosition; i < MAX_MISSING_NUMBER_PLEASE; i++) {
            progression.append(nextNumber).append(" ");
            nextNumber += step;
        }
        return String.valueOf(progression);
    }
}

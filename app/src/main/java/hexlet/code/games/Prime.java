package hexlet.code.games;

import hexlet.code.Gameable;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Prime implements Gameable {
    private final String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    @Override
    public RoundData createRoundData() {
        int number = Utils.generateRandomNumber(1, Utils.MAX_NUMBER);
        String question = String.valueOf(number);
        String answer = isPrime(number);
        return new RoundData(question, answer);
    }
    private String isPrime(int number) {
        if (number == 1) {
            return "no";
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public String getRule() {
        return rule;
    }
}

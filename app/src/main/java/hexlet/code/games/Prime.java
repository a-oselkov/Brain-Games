package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Gaming;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUND_INFO;

public class Prime implements Gaming {
    public Prime() {
        Engine.rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public void makeGame() {
        String answer;
        String question;
        for (int i = 0; i < Engine.getMaxRounds(); i++) {
            int number = Utils.generateRandomNumber(1, Utils.MAX_NUMBER);
            question = String.valueOf(number);
            answer = isPrime(number);
            ROUND_INFO[i] = new RoundInfo(question, answer);
        }
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
}

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Gaming;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.ROUND_INFO;

public class Prime implements Gaming {
    @Override
    public void generateGame() {
        Engine.rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String answer;
        String question;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            int number = Utils.generateRandomNumber(1, Utils.MAX_NUMBER);
            question = String.valueOf(number);
            answer = "yes";
            if (number == 1) {
                answer = "no";
            }
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    answer = "no";
                    break;
                }
            }
            ROUND_INFO[i] = new RoundInfo(question, answer);
        }
    }
}

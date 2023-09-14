package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Gaming;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Even implements Gaming {
    @Override
    public void makeGame() {
        Engine.setRule("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String answer;
        String question;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            int number = Utils.generateRandomNumber();
            question = String.valueOf(number);
            if (number % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            Engine.setRoundInfo(i, new RoundInfo(question, answer));
        }
    }
}


package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Gaming;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUND_INFO;

public class Even implements Gaming {
    public Even() {
        Engine.rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public void makeGame() {
        String answer;
        String question;
        for (int i = 0; i < Engine.getMaxRounds(); i++) {
            int number = Utils.generateRandomNumber();
            question = String.valueOf(number);
            answer = isEven(number);
            ROUND_INFO[i] = new RoundInfo(question, answer);
        }
    }

    public String isEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}


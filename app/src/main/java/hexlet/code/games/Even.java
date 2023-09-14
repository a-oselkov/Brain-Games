package hexlet.code.games;

import hexlet.code.Gaming;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Even implements Gaming {
    @Override
    public RoundData makeGame() {
        int number = Utils.generateRandomNumber();
        String question = String.valueOf(number);
        String answer = isEven(number);
        return new RoundData(question, answer);
    }
    public String isEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }


}


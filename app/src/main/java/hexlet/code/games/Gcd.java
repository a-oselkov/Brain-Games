package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Gaming;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUND_INFO;

public class Gcd implements Gaming {
    public Gcd() {
        Engine.rule = "Find the greatest common divisor of given numbers.";
    }

    @Override
    public void makeGame() {
        String answer;
        String question;
        for (int i = 0; i < Engine.getMaxRounds(); i++) {
            int number1 = Utils.generateRandomNumber();
            int number2 = Utils.generateRandomNumber();
            question = number1 + " " + number2;

            while (number2 > 0) {
                int temp = number1 % number2;
                number1 = number2;
                number2 = temp;
            }
            answer = String.valueOf(number1);
            ROUND_INFO[i] = new RoundInfo(question, answer);
        }
    }
}

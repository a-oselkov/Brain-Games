package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public enum Game {
    EVEN(new Even(), "Answer 'yes' if the number is even, otherwise answer 'no'."),
    CALC(new Calc(), "What is the result of the expression?"),
    GCD(new Gcd(), "Find the greatest common divisor of given numbers."),
    PROGRESSION(new Progression(), "What number is missing in the progression?"),
    PRIME(new Prime(), "Answer 'yes' if given number is prime. Otherwise answer 'no'.");

    private final Gameable game;
    private final String rule;

    Game(Gameable game, String rule) {
        this.game = game;
        this.rule = rule;
    }

    public Gameable getGame() {
        return game;
    }

    public String getRule() {
        return rule;
    }
}


package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public enum Games {
    EVEN(new Even()),
    CALC(new Calc()),
    GCD(new Gcd()),
    PROGRESSION(new Progression()),
    PRIME(new Prime());

    private final Gaming game;

    Games(Gaming game) {
        this.game = game;
    }

    public Gaming getGame() {
        return game;
    }
}


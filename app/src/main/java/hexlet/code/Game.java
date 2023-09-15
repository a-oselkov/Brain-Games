package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public enum Game {
    EVEN(new Even()),
    CALC(new Calc()),
    GCD(new Gcd()),
    PROGRESSION(new Progression()),
    PRIME(new Prime());

    private final Gameable game;

    Game(Gameable game) {
        this.game = game;
    }

    public Gameable getGame() {
        return game;
    }
}


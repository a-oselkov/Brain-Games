package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.roundInfo;

public class Prime {
    private static final String PRIME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void generateQuestionsAnswersForPrime() {
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
            roundInfo[i] = new RoundInfo(question, answer);
        }
    }

        public static void playPrime() {
            Engine.playGame(PRIME_RULES, roundInfo);
        }
    }

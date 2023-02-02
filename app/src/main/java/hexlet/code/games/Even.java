package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Even {
    private static final String EVEN_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static String[] generateRound() {
        String answer;
        String question;
        int number = Utils.generateRandomNumber();
        question = String.valueOf(number);
        if (number % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }
        String[] questionAnswerRound = {question, answer};
        return questionAnswerRound;
    }
    public static void playEven() {
        String[][] questionAnswerGame = new String[MAX_ROUNDS][2];
        String[] questionAnswerRound;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            questionAnswerRound = generateRound();
            questionAnswerGame[i][0] = questionAnswerRound[0];
            questionAnswerGame[i][1] = questionAnswerRound[1];
        }
        //System.out.println(Arrays.deepToString(questionAnswerGame));
        Engine.playProgress(EVEN_RULES, questionAnswerGame);
    }
}


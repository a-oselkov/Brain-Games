package hexlet.code;

public class RoundData {
    private final String question;
    private final String answer;

    public RoundData(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public final String getQuestion() {
        return question;
    }

    public final String getAnswer() {
        return answer;
    }
}

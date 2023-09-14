package hexlet.code;

public class RoundData {
    private final String question;
    private final String answer;

    public RoundData(String q, String a) {
        this.question = q;
        this.answer = a;
    }

    public final String getQuestion() {
        return question;
    }

    public final String getAnswer() {
        return answer;
    }
}

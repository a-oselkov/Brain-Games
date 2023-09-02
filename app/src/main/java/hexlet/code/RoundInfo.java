package hexlet.code;

public class RoundInfo {
    private final String question;
    private final String answer;

    public RoundInfo(String q, String a) {
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

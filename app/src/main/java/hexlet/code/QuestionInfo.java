package hexlet.code;

public class QuestionInfo {
    private final String question;
    private final String answer;

    public QuestionInfo(String question, String answer) {
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

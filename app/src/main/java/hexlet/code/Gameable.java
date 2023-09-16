package hexlet.code;

public interface Gameable {
    default RoundData getRoundData() {
        return new RoundData(generateQuestion(), generateAnswer());
    }
    String generateQuestion();
    String generateAnswer();
    String getDescription();
}

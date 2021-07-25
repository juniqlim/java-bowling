package bowling;

public class PitchingScore {
    private int firstScore;
    private int secondScore;

    private PitchingScore() {
    }

    public static PitchingScore create() {
        return new PitchingScore();
    }

    public void firstPitching(int score) {
        firstScore = score;
    }

    public void secondPitching(int score) {
        secondScore = score;
    }

    public int score() {
        return firstScore + secondScore;
    }
}

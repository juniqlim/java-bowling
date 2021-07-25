package bowling;

public class PitchingScore {
    private Score first;
    private Score second;

    private PitchingScore() {
    }

    public static PitchingScore create() {
        return new PitchingScore();
    }

    public void firstPitching(int score) {
        first = Score.create(score);
    }

    public void secondPitching(int score) {
        second = Score.create(score);
    }

    public Score score() {
        return first.sum(second);
    }
}

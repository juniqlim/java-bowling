package bowling;

public class GameScore {
    private PitchingScore pitching;
    private Score bonus;

    private GameScore() {
    }

    public static GameScore create() {
        return new GameScore();
    }

    public void firstPitching(int score) {

    }

    public void secondPitching(int score) {

    }

    public void bonus(int score) {

    }

    public int totalScore() {
        return 0;
    }
}

package bowling;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class GameScoreTest {
    @Test
    void test() {
        GameScore gameScore = GameScore.create();
        gameScore.firstPitching(8);
        gameScore.secondPitching(2);
        gameScore.bonus(7);

        assertThat(gameScore.totalScore()).isEqualTo(17);
    }
}

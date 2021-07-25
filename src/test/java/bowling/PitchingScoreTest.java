package bowling;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PitchingScoreTest {
    @Test
    void score() {
        PitchingScore pitchingScore = PitchingScore.create();
        pitchingScore.firstPitching(8);
        pitchingScore.secondPitching(1);
        assertThat(pitchingScore.score()).isEqualTo(9);
    }
}
package bowling;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ScoreTest {
    @Test
    void create() {
        Score score = Score.create(8);
        assertThat(score.value()).isEqualTo(8);
    }

    @Test
    void sum() {
        Score first = Score.create(8);
        Score second = Score.create(2);
        assertThat(first.sum(second)).isEqualTo(Score.create(10));
    }
}
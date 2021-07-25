package bowling;

import java.util.Objects;

public class Score {
    private int value;

    private Score(int value) {
        this.value = value;
    }

    public static Score create(int value) {
        return new Score(value);
    }

    public int value() {
        return value;
    }

    public Score sum(Score score) {
        value += score.value;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Score)) {
            return false;
        }
        Score score = (Score) o;
        return value == score.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

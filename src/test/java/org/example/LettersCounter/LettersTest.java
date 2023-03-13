package org.example.LettersCounter;

import org.example.Calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LettersTest {

    @Test
    public void returnsCorrectNumberOfCharacter() {
        final int actual = LettersCounter.Count('a', "arturas");
        final int expected = 2;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void returnsFalseNumberOfCharacter() {
        final int actual = LettersCounter.Count('m', "monster");
        final int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void returnsZeroNumberOfCharacter() {
        final int actual = LettersCounter.Count('z', "opera");
        final int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }
}

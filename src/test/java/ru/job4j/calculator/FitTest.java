package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {
    @Test
    public void whenMan183Than95dot44() {
        short man = 183;
        double expected = 95.44;
        double rsl = Fit.manWeight(man);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenWoman165Then63dot24() {
        short woman = 165;
        double expected = 63.24;
        double rsl = Fit.womanWeight(woman);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }
}
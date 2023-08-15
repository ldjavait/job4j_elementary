package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SqAreaTest {
    @Test
    public void whenP6K2Than2() {
        double expected = 2;
        double result = SqArea.square(6, 2);
        assertThat(result).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void whenP4K1Than1() {
        byte expected = 1;
        double rsl = SqArea.square(4, 1);
        assertThat(rsl).isCloseTo(expected, offset(0.01));
    }
}
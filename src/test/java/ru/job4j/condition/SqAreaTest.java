package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SqAreaTest {
    @Test
    public void whenP6K2Than2() {
        byte p = 6;
        byte k = 2;
        double expected = 2;
        double result = SqArea.square(p, k);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}
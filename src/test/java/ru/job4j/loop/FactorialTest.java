package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {
    @Test
    public void whenCalculateFactorialFor5Then120() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl).isEqualTo(expected);
    }
}
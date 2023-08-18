package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PrimeNumberTest {
    @Test
    public void whenFinish5Than3() {
        int rsl = PrimeNumber.calc(5);
        int expected = 3;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenFinish51Than15() {
        int rsl = PrimeNumber.calc(51);
        int expected = 15;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenFinish555Than101() {
        int rsl = PrimeNumber.calc(555);
        int expected = 101;
        assertThat(rsl).isEqualTo(expected);
    }
}
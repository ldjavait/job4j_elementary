package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitnessTest {
    @Test
    public void whenIvan95Nik90Than0() {
        int rsl = Fitness.calc(95, 90);
        int expected = 0;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenIvan90Nik95Than1() {
        int rsl = Fitness.calc(90, 95);
        int expected = 1;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenIvan50Nik90Than2() {
        int rsl = Fitness.calc(50, 90);
        int expected = 2;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenIvan90Nik90Than1() {
        int rsl = Fitness.calc(90, 90);
        int expected = 1;
        assertThat(rsl).isEqualTo(expected);
    }
}
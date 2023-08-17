package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {
    @Test
    public void whenStart0Finish5Than15() {
        int rsl = Counter.sum(0, 5);
        int expected = 15;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenStart1Finish10Than30() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenStart3Finish8Than18() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl).isEqualTo(expected);
    }
}
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
}